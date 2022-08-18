import {RemoteApp} from '@eclipse-scout/core';
import * as anippe from './index';

Object.assign({}, anippe); // Use import so that it is not marked as unused

new RemoteApp().init();
