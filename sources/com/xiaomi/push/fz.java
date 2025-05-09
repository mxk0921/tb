package com.xiaomi.push;

import java.net.UnknownHostException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
final class fz {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        ft f14891a;

        /* renamed from: a  reason: collision with other field name */
        String f1017a;
    }

    public static a a(Exception exc) {
        m699a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        String str = exc2.getClass().getSimpleName() + ":" + message;
        int a2 = gs.a(exc2);
        if (a2 != 0) {
            aVar.f14891a = ft.a(ft.GSLB_REQUEST_SUCCESS.a() + a2);
        }
        if (aVar.f14891a == null) {
            aVar.f14891a = ft.GSLB_TCP_ERR_OTHER;
        }
        if (aVar.f14891a == ft.GSLB_TCP_ERR_OTHER) {
            aVar.f1017a = str;
        }
        return aVar;
    }

    public static a b(Exception exc) {
        ft ftVar;
        ft ftVar2;
        Throwable cause;
        m699a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 != 0) {
            ft a3 = ft.a(ft.CONN_SUCCESS.a() + a2);
            aVar.f14891a = a3;
            if (a3 == ft.CONN_BOSH_ERR && (cause = exc2.getCause()) != null && (cause instanceof UnknownHostException)) {
                ftVar2 = ft.CONN_BOSH_UNKNOWNHOST;
            }
            ftVar = aVar.f14891a;
            if (ftVar != ft.CONN_TCP_ERR_OTHER || ftVar == ft.CONN_XMPP_ERR || ftVar == ft.CONN_BOSH_ERR) {
                aVar.f1017a = str;
            }
            return aVar;
        }
        ftVar2 = ft.CONN_XMPP_ERR;
        aVar.f14891a = ftVar2;
        ftVar = aVar.f14891a;
        if (ftVar != ft.CONN_TCP_ERR_OTHER) {
        }
        aVar.f1017a = str;
        return aVar;
    }

    public static a c(Exception exc) {
        ft ftVar;
        ft ftVar2;
        m699a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        if (exc2.getCause() != null) {
            message = exc2.getCause().getMessage();
        }
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            ftVar2 = ft.BIND_TCP_READ_TIMEOUT;
        } else if (a2 == 199) {
            ftVar2 = ft.BIND_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f14891a = ft.BIND_BOSH_ERR;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ftVar2 = ft.BIND_BOSH_ITEM_NOT_FOUND;
            }
            ftVar = aVar.f14891a;
            if (ftVar != ft.BIND_TCP_ERR || ftVar == ft.BIND_XMPP_ERR || ftVar == ft.BIND_BOSH_ERR) {
                aVar.f1017a = str;
            }
            return aVar;
        } else if (a2 == 109) {
            ftVar2 = ft.BIND_TCP_CONNRESET;
        } else if (a2 != 110) {
            ftVar2 = ft.BIND_XMPP_ERR;
        } else {
            ftVar2 = ft.BIND_TCP_BROKEN_PIPE;
        }
        aVar.f14891a = ftVar2;
        ftVar = aVar.f14891a;
        if (ftVar != ft.BIND_TCP_ERR) {
        }
        aVar.f1017a = str;
        return aVar;
    }

    public static a d(Exception exc) {
        ft ftVar;
        ft ftVar2;
        m699a(exc);
        boolean z = exc instanceof hb;
        Exception exc2 = exc;
        if (z) {
            hb hbVar = (hb) exc;
            exc2 = exc;
            if (hbVar.a() != null) {
                exc2 = hbVar.a();
            }
        }
        a aVar = new a();
        String message = exc2.getMessage();
        int a2 = gs.a(exc2);
        String str = exc2.getClass().getSimpleName() + ":" + message;
        if (a2 == 105) {
            ftVar2 = ft.CHANNEL_TCP_READTIMEOUT;
        } else if (a2 == 199) {
            ftVar2 = ft.CHANNEL_TCP_ERR;
        } else if (a2 == 499) {
            aVar.f14891a = ft.CHANNEL_BOSH_EXCEPTION;
            if (message.startsWith("Terminal binding condition encountered: item-not-found")) {
                ftVar2 = ft.CHANNEL_BOSH_ITEMNOTFIND;
            }
            ftVar = aVar.f14891a;
            if (ftVar != ft.CHANNEL_TCP_ERR || ftVar == ft.CHANNEL_XMPPEXCEPTION || ftVar == ft.CHANNEL_BOSH_EXCEPTION) {
                aVar.f1017a = str;
            }
            return aVar;
        } else if (a2 == 109) {
            ftVar2 = ft.CHANNEL_TCP_CONNRESET;
        } else if (a2 != 110) {
            ftVar2 = ft.CHANNEL_XMPPEXCEPTION;
        } else {
            ftVar2 = ft.CHANNEL_TCP_BROKEN_PIPE;
        }
        aVar.f14891a = ftVar2;
        ftVar = aVar.f14891a;
        if (ftVar != ft.CHANNEL_TCP_ERR) {
        }
        aVar.f1017a = str;
        return aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m699a(Exception exc) {
        exc.getClass();
    }
}
