package com.huawei.hms.adapter.sysobs;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class SystemManager {

    /* renamed from: a  reason: collision with root package name */
    private static SystemManager f5257a = new SystemManager();
    private static final Object b = new Object();
    private static SystemNotifier c = new a();

    private SystemManager() {
    }

    public static SystemManager getInstance() {
        return f5257a;
    }

    public static SystemNotifier getSystemNotifier() {
        return c;
    }

    public void notifyNoticeResult(int i) {
        c.notifyNoticeObservers(i);
    }

    public void notifyResolutionResult(Intent intent, String str) {
        c.notifyObservers(intent, str);
    }

    public void notifyUpdateResult(int i) {
        c.notifyObservers(i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements SystemNotifier {

        /* renamed from: a  reason: collision with root package name */
        private final List<SystemObserver> f5258a = new ArrayList();

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyNoticeObservers(int i) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.f5258a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onNoticeResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(Intent intent, String str) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.f5258a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onSolutionResult(intent, str)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void registerObserver(SystemObserver systemObserver) {
            if (systemObserver != null && !this.f5258a.contains(systemObserver)) {
                synchronized (SystemManager.b) {
                    this.f5258a.add(systemObserver);
                }
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void unRegisterObserver(SystemObserver systemObserver) {
            synchronized (SystemManager.b) {
                this.f5258a.remove(systemObserver);
            }
        }

        @Override // com.huawei.hms.adapter.sysobs.SystemNotifier
        public void notifyObservers(int i) {
            synchronized (SystemManager.b) {
                try {
                    Iterator<SystemObserver> it = this.f5258a.iterator();
                    while (it.hasNext()) {
                        if (it.next().onUpdateResult(i)) {
                            it.remove();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
