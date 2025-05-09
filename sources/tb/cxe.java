package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class cxe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ezc f17409a;
    public final jpb b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public ezc f17410a;
        public final jpb b;

        public b(jpb jpbVar) {
            this.b = jpbVar;
        }

        public cxe a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cxe) ipChange.ipc$dispatch("3d696642", new Object[]{this});
            }
            cxe cxeVar = new cxe(this.b);
            cxe.a(cxeVar, this.f17410a);
            return cxeVar;
        }

        public b b(ezc ezcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c1a60583", new Object[]{this, ezcVar});
            }
            this.f17410a = ezcVar;
            return this;
        }
    }

    public static /* synthetic */ ezc a(cxe cxeVar, ezc ezcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezc) ipChange.ipc$dispatch("e3fa1fb", new Object[]{cxeVar, ezcVar});
        }
        cxeVar.f17409a = ezcVar;
        return ezcVar;
    }

    public jpb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpb) ipChange.ipc$dispatch("9870660e", new Object[]{this});
        }
        return this.b;
    }

    public ezc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ezc) ipChange.ipc$dispatch("3544f132", new Object[]{this});
        }
        return this.f17409a;
    }

    public cxe(jpb jpbVar) {
        this.b = jpbVar;
    }
}
