import { WebPlugin } from '@capacitor/core';

import type { ccacPlugin } from './definitions';

export class ccacWeb extends WebPlugin implements ccacPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
    
  }
  async clear(): Promise<{ value: string }> {
    // This stub implementation simply returns a resolved promise.
    return { value: 'Stub: clear method exists but does not clear anything' };
  }

}
