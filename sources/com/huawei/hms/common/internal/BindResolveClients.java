package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BindResolveClients {
    private static final Object b = new Object();

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<ResolveClientBean> f5313a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private static final BindResolveClients f5314a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.f5314a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean contains;
        synchronized (b) {
            contains = this.f5313a.contains(resolveClientBean);
        }
        return contains;
    }

    public void notifyClientReconnect() {
        synchronized (b) {
            try {
                ListIterator<ResolveClientBean> listIterator = this.f5313a.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.next().clientReconnect();
                }
                this.f5313a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean != null) {
            synchronized (b) {
                try {
                    if (!this.f5313a.contains(resolveClientBean)) {
                        this.f5313a.add(resolveClientBean);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean != null) {
            synchronized (b) {
                try {
                    if (this.f5313a.contains(resolveClientBean)) {
                        ListIterator<ResolveClientBean> listIterator = this.f5313a.listIterator();
                        while (true) {
                            if (listIterator.hasNext()) {
                                if (resolveClientBean.equals(listIterator.next())) {
                                    listIterator.remove();
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void unRegisterAll() {
        synchronized (b) {
            this.f5313a.clear();
        }
    }

    private BindResolveClients() {
        this.f5313a = new ArrayList<>();
    }
}
