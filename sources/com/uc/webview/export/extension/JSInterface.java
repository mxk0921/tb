package com.uc.webview.export.extension;

import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.base.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class JSInterface implements IExtender {
    private AtomicBoolean mInited = new AtomicBoolean(false);
    private Object mJSInterfaceImpl;
    private JSRoute mLastJSRoute;
    private Object mLastJSRouteImpl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class JSRoute implements IExtender {
        private Object mJSRouteImpl;

        public JSRoute(Object obj) {
            this.mJSRouteImpl = obj;
        }

        public IRouteID getID() {
            try {
                Object invoke = Sdk2CoreHost.impl().invoke(1, new Object[]{this.mJSRouteImpl});
                if (invoke instanceof IRouteID) {
                    return (IRouteID) invoke;
                }
                return null;
            } catch (Exception e) {
                Log.e("JSInterface", "getJSRouteId", e);
                return null;
            }
        }

        @Override // com.uc.webview.base.IExtender
        public Object invoke(int i, Object[] objArr) {
            return null;
        }

        public void send(Object[] objArr, ValueCallback<Boolean> valueCallback) {
            try {
                Sdk2CoreHost.impl().sendMessageToJS(this.mJSRouteImpl, objArr, valueCallback);
            } catch (Exception e) {
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(Boolean.FALSE);
                }
                Log.e("JSInterface", "send", e);
            }
        }
    }

    public static boolean enableMultiRenderJsRoute() {
        try {
            Object invoke = Sdk2CoreHost.impl().invoke(7, new Object[0]);
            if (invoke != null) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Exception e) {
            Log.e("JSInterface", "enableMultiRenderJsRoute", e);
        }
        return false;
    }

    private void ensureInit() {
        if (!this.mInited.get()) {
            synchronized (this) {
                if (!this.mInited.get()) {
                    try {
                        this.mJSInterfaceImpl = Sdk2CoreHost.impl().createJSInterface(this);
                    } catch (Exception e) {
                        Log.e("JSInterface", "JSInterface", e);
                    }
                    this.mInited.set(true);
                }
            }
        }
    }

    public Object getImpl() {
        ensureInit();
        return this.mJSInterfaceImpl;
    }

    public JSRoute getJSRoute() {
        try {
            Object jSRoute = Sdk2CoreHost.impl().getJSRoute(getImpl());
            if (jSRoute != this.mLastJSRouteImpl) {
                this.mLastJSRouteImpl = jSRoute;
                this.mLastJSRoute = new JSRoute(jSRoute);
            }
            return this.mLastJSRoute;
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            Log.e("JSInterface", "getJSRoute", e2);
            return null;
        }
    }

    public String getUrl() {
        try {
            return Sdk2CoreHost.impl().getUrlFromJSInterface(getImpl());
        } catch (IllegalStateException e) {
            throw new RuntimeException(e);
        } catch (Exception e2) {
            Log.e("JSInterface", "getUrl", e2);
            return null;
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }
}
