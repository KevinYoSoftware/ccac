package com.yosoftware.plugins.ccac;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.webkit.CookieManager;
import android.webkit.WebView;

@CapacitorPlugin(name = "ccac")
public class ccacPlugin extends Plugin {

    private ccac implementation = new ccac();

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    @PluginMethod
    public void clear(PluginCall call) {

        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.removeAllCookies(null);
        cookieManager.flush();

        getActivity().runOnUiThread(() -> {
            WebView webView = getBridge().getWebView();
            if (webView != null) {
                webView.clearCache(true);
            }

            JSObject ret = new JSObject();
            ret.put("value", "Cleared");
            call.resolve(ret);
        });
    }

}
