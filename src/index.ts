import { registerPlugin } from '@capacitor/core';

import type { ccacPlugin } from './definitions';

const ccac = registerPlugin<ccacPlugin>('ccac', {
  web: () => import('./web').then((m) => new m.ccacWeb()),
});

export * from './definitions';
export { ccac };
