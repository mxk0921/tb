package com.uc.webview.export;

import com.uc.webview.internal.b;
import com.uc.webview.internal.e;
import com.uc.webview.internal.interfaces.IServiceWorkerController;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ServiceWorkerController {
    private static HashMap<Integer, ServiceWorkerController> sInstances;
    private IServiceWorkerController mServiceWorkerController;

    private ServiceWorkerController(IServiceWorkerController iServiceWorkerController) {
        this.mServiceWorkerController = iServiceWorkerController;
    }

    public static ServiceWorkerController getInstance() {
        return getInstance(e.a());
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("doesn't implement Cloneable");
    }

    public ServiceWorkerWebSettings getServiceWorkerWebSettings() {
        return this.mServiceWorkerController.getServiceWorkerWebSettings();
    }

    public void setServiceWorkerClient(ServiceWorkerClient serviceWorkerClient) {
        this.mServiceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static ServiceWorkerController getInstance(WebView webView) {
        return getInstance(webView.getCurrentViewCoreType());
    }

    private static synchronized ServiceWorkerController getInstance(int i) throws RuntimeException {
        ServiceWorkerController serviceWorkerController;
        synchronized (ServiceWorkerController.class) {
            try {
                if (sInstances == null) {
                    sInstances = new HashMap<>();
                }
                serviceWorkerController = sInstances.get(Integer.valueOf(i));
                if (serviceWorkerController == null) {
                    serviceWorkerController = new ServiceWorkerController(b.b(i));
                    sInstances.put(Integer.valueOf(i), serviceWorkerController);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return serviceWorkerController;
    }
}
