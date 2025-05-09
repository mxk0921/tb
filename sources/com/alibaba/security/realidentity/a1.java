package com.alibaba.security.realidentity;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String e = "StateMachine";
    public static final int f = -1;
    public static final int g = -1;

    /* renamed from: a  reason: collision with root package name */
    public String f2650a;
    public boolean b;
    public d c;
    public HandlerThread d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int d = 20;

        /* renamed from: a  reason: collision with root package name */
        public Vector<b> f2652a = new Vector<>();
        public int b = 20;
        public int c = 0;

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f2652a.size();
        }

        public b a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("886eb297", new Object[]{this, new Integer(i)});
            }
            int i2 = this.c + i;
            int i3 = this.b;
            if (i2 >= i3) {
                i2 -= i3;
            }
            if (i2 >= a()) {
                return null;
            }
            return this.f2652a.get(i2);
        }

        public void a(Message message, z0 z0Var, z0 z0Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdaa13a3", new Object[]{this, message, z0Var, z0Var2});
            } else if (this.f2652a.size() < this.b) {
                this.f2652a.add(new b(message, z0Var, z0Var2));
            } else {
                b bVar = this.f2652a.get(this.c);
                int i = this.c + 1;
                this.c = i;
                if (i >= this.b) {
                    this.c = 0;
                }
                bVar.a(message, z0Var, z0Var2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class d extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Object o = new Object();

        /* renamed from: a  reason: collision with root package name */
        public Message f2653a;
        public c b;
        public boolean c;
        public c[] d;
        public int e;
        public c[] f;
        public int g;
        public a h;
        public b i;
        public a1 j;
        public HashMap<z0, c> k;
        public z0 l;
        public z0 m;
        public ArrayList<Message> n;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a extends z0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/a1$d$a");
            }

            @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
            public boolean a(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
                }
                d.c(d.this).b(message);
                return true;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class b extends z0 {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/a1$d$b");
            }

            @Override // com.alibaba.security.realidentity.z0, com.alibaba.security.realidentity.y0
            public boolean a(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("6a99d9bf", new Object[]{this, message})).booleanValue();
                }
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class c {

            /* renamed from: a  reason: collision with root package name */
            public z0 f2654a;
            public c b;
            public boolean c;

            public c() {
            }
        }

        public static /* synthetic */ void a(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a6428a2", new Object[]{dVar});
            } else {
                dVar.e();
            }
        }

        public static /* synthetic */ void b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e504eb23", new Object[]{dVar});
            } else {
                dVar.a();
            }
        }

        public static /* synthetic */ a1 c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a1) ipChange.ipc$dispatch("ab0dd5ac", new Object[]{dVar}) : dVar.j;
        }

        private void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("596b2eb", new Object[]{this});
                return;
            }
            a aVar = null;
            while (true) {
                z0 z0Var = this.m;
                if (z0Var == null) {
                    break;
                }
                this.m = null;
                a(b(z0Var));
                a(c());
                b();
                aVar = z0Var;
            }
            if (aVar == null) {
                return;
            }
            if (aVar == this.i) {
                this.j.e();
                if (a1.a(this.j) != null) {
                    getLooper().quit();
                    a1.a(this.j, (HandlerThread) null);
                }
            } else if (aVar == this.h) {
                this.j.c();
            }
        }

        private final void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            } else {
                sendMessage(obtainMessage(-1, o));
            }
        }

        private final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
                return;
            }
            c cVar = this.k.get(this.l);
            this.g = 0;
            while (cVar != null) {
                c[] cVarArr = this.f;
                int i = this.g;
                cVarArr[i] = cVar;
                cVar = cVar.b;
                this.g = i + 1;
            }
            this.e = -1;
            c();
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/a1$d");
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            this.f2653a = message;
            if (this.c) {
                c(message);
                d();
            }
        }

        public d(Looper looper, a1 a1Var) {
            super(looper);
            this.b = new c();
            this.e = -1;
            this.h = new a();
            this.i = new b();
            this.k = new HashMap<>();
            this.n = new ArrayList<>();
            this.j = a1Var;
            a(this.h, (z0) null);
            a(this.i, (z0) null);
        }

        public static /* synthetic */ c a(d dVar, z0 z0Var, z0 z0Var2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("62ff9be7", new Object[]{dVar, z0Var, z0Var2}) : dVar.a(z0Var, z0Var2);
        }

        private final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            for (int size = this.n.size() - 1; size >= 0; size--) {
                sendMessageAtFrontOfQueue(this.n.get(size));
            }
            this.n.clear();
        }

        private final void c(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72fa73bd", new Object[]{this, message});
                return;
            }
            c cVar = this.d[this.e];
            while (true) {
                if (cVar.f2654a.a(message)) {
                    break;
                }
                cVar = cVar.b;
                if (cVar == null) {
                    this.j.c(message);
                    if (b(message)) {
                        a((y0) this.i);
                    }
                }
            }
            if (cVar != null) {
                this.b.a(message, cVar.f2654a, this.d[this.e].f2654a);
            } else {
                this.b.a(message, null, null);
            }
        }

        public static /* synthetic */ void a(d dVar, z0 z0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b731dbd6", new Object[]{dVar, z0Var});
            } else {
                dVar.a(z0Var);
            }
        }

        public static /* synthetic */ void a(d dVar, y0 y0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b723c455", new Object[]{dVar, y0Var});
            } else {
                dVar.a(y0Var);
            }
        }

        public static /* synthetic */ void a(d dVar, Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd0334f5", new Object[]{dVar, message});
            } else {
                dVar.a(message);
            }
        }

        private final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            int i = 0;
            for (c cVar : this.k.values()) {
                int i2 = 0;
                while (cVar != null) {
                    cVar = cVar.b;
                    i2++;
                }
                if (i < i2) {
                    i = i2;
                }
            }
            this.d = new c[i];
            this.f = new c[i];
            f();
            this.c = true;
            this.f2653a = obtainMessage(-1);
            a(0);
            d();
        }

        private final c b(z0 z0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2fa28374", new Object[]{this, z0Var});
            }
            this.g = 0;
            c cVar = this.k.get(z0Var);
            do {
                c[] cVarArr = this.f;
                int i = this.g;
                this.g = i + 1;
                cVarArr[i] = cVar;
                cVar = cVar.b;
                if (cVar == null) {
                    break;
                }
            } while (!cVar.c);
            return cVar;
        }

        private final boolean b(Message message) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eeca26c0", new Object[]{this, message})).booleanValue() : message.what == -1 && message.obj == o;
        }

        private final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
            }
            int i = this.e + 1;
            int i2 = i;
            for (int i3 = this.g - 1; i3 >= 0; i3--) {
                this.d[i2] = this.f[i3];
                i2++;
            }
            this.e = i2 - 1;
            return i;
        }

        private final void a(c cVar) {
            c cVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40d26903", new Object[]{this, cVar});
                return;
            }
            while (true) {
                int i = this.e;
                if (i >= 0 && (cVar2 = this.d[i]) != cVar) {
                    cVar2.f2654a.a();
                    c[] cVarArr = this.d;
                    int i2 = this.e;
                    cVarArr[i2].c = false;
                    this.e = i2 - 1;
                } else {
                    return;
                }
            }
        }

        private final void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                return;
            }
            while (i <= this.e) {
                this.d[i].f2654a.b();
                this.d[i].c = true;
                i++;
            }
        }

        private final c a(z0 z0Var, z0 z0Var2) {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("4b8257e1", new Object[]{this, z0Var, z0Var2});
            }
            if (z0Var2 != null) {
                cVar = this.k.get(z0Var2);
                if (cVar == null) {
                    cVar = a(z0Var2, (z0) null);
                }
            } else {
                cVar = null;
            }
            c cVar2 = this.k.get(z0Var);
            if (cVar2 == null) {
                cVar2 = new c();
                this.k.put(z0Var, cVar2);
            }
            c cVar3 = cVar2.b;
            if (cVar3 == null || cVar3 == cVar) {
                cVar2.f2654a = z0Var;
                cVar2.b = cVar;
                cVar2.c = false;
                return cVar2;
            }
            throw new RuntimeException("state already added");
        }

        private final void a(z0 z0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3af1b1c", new Object[]{this, z0Var});
            } else {
                this.l = z0Var;
            }
        }

        private final void a(y0 y0Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3a1039b", new Object[]{this, y0Var});
            } else {
                this.m = (z0) y0Var;
            }
        }

        private final void a(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
                return;
            }
            Message obtainMessage = obtainMessage();
            obtainMessage.copyFrom(message);
            this.n.add(obtainMessage);
        }
    }

    public a1(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        this.d = handlerThread;
        handlerThread.start();
        a(str, this.d.getLooper());
    }

    public static /* synthetic */ HandlerThread a(a1 a1Var) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HandlerThread) ipChange.ipc$dispatch("ea8223fa", new Object[]{a1Var}) : a1Var.d;
    }

    public void b(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeca26bc", new Object[]{this, message});
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b) {
            this.b = false;
            d.a(this.c);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            d.b(this.c);
        }
    }

    public static /* synthetic */ HandlerThread a(a1 a1Var, HandlerThread handlerThread) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("291c7674", new Object[]{a1Var, handlerThread});
        }
        a1Var.d = handlerThread;
        return handlerThread;
    }

    public final void b(z0 z0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f089dd", new Object[]{this, z0Var});
        } else {
            d.a(this.c, z0Var);
        }
    }

    public void c(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fa73bd", new Object[]{this, message});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f2651a;
        public z0 b;
        public z0 c;

        public b(Message message, z0 z0Var, z0 z0Var2) {
            a(message, z0Var, z0Var2);
        }

        public void a(Message message, z0 z0Var, z0 z0Var2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cdaa13a3", new Object[]{this, message, z0Var, z0Var2});
                return;
            }
            this.f2651a = message.what;
            this.b = z0Var;
            this.c = z0Var2;
        }

        public z0 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z0) ipChange.ipc$dispatch("43eb5441", new Object[]{this});
            }
            return this.b;
        }

        public int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
            }
            return this.f2651a;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "what=" + this.f2651a + " state=" + a(this.b) + " orgState=" + a(this.c);
        }

        public z0 a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (z0) ipChange.ipc$dispatch("3c861f22", new Object[]{this}) : this.c;
        }

        private String a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
            }
            if (obj == null) {
                return "null";
            }
            String name = obj.getClass().getName();
            return name.substring(name.lastIndexOf(36) + 1);
        }
    }

    private void a(String str, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc666733", new Object[]{this, str, looper});
            return;
        }
        this.f2650a = str;
        this.c = new d(looper, this);
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f2650a;
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.c.sendMessage(a(i));
        }
    }

    public final void a(z0 z0Var, z0 z0Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2d22d0", new Object[]{this, z0Var, z0Var2});
        } else {
            d.a(this.c, z0Var, z0Var2);
        }
    }

    public final void b(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf718196", new Object[]{this, new Integer(i), obj});
        } else {
            this.c.sendMessage(a(i, obj));
        }
    }

    public final void a(z0 z0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3af1b1c", new Object[]{this, z0Var});
        } else {
            d.a(this.c, z0Var, null);
        }
    }

    public final void a(y0 y0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a1039b", new Object[]{this, y0Var});
        } else {
            d.a(this.c, y0Var);
        }
    }

    public final void a(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a99d9bb", new Object[]{this, message});
        } else {
            d.a(this.c, message);
        }
    }

    public final Handler a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("b016d95e", new Object[]{this}) : this.c;
    }

    public final Message a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("107d762e", new Object[]{this, new Integer(i)}) : Message.obtain(this.c, i);
    }

    public final Message a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Message) ipChange.ipc$dispatch("bab02992", new Object[]{this, new Integer(i), obj}) : Message.obtain(this.c, i, obj);
    }
}
