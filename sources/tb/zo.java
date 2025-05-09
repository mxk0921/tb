package tb;

import com.alibaba.android.aura.AURAInputData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zo<INPUT extends Serializable, OUTPUT extends Serializable> extends un<INPUT, OUTPUT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public pt<OUTPUT> c;
    public final bp d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends pt<OUTPUT> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/AURAWork2SubscribeServiceWrapper$1");
        }

        @Override // tb.pt
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e3b41b3", new Object[]{this});
            } else {
                zo.m0(zo.this).a();
            }
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
            } else {
                zo.m0(zo.this).b(miVar);
            }
        }

        @Override // tb.pt
        public void c(yk ykVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a18a85df", new Object[]{this, ykVar});
            } else {
                zo.m0(zo.this).c(ykVar);
            }
        }
    }

    static {
        t2o.a(79691935);
    }

    public zo(bp bpVar) {
        this.d = bpVar;
    }

    public static /* synthetic */ Object ipc$super(zo zoVar, String str, Object... objArr) {
        if (str.hashCode() == -1117259578) {
            super.B((AURAInputData) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/AURAWork2SubscribeServiceWrapper");
    }

    public static /* synthetic */ pt m0(zo zoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pt) ipChange.ipc$dispatch("9c0152bf", new Object[]{zoVar});
        }
        return zoVar.c;
    }

    @Override // tb.un
    public void B(AURAInputData<INPUT> aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd67f8c6", new Object[]{this, aURAInputData});
            return;
        }
        super.B(aURAInputData);
        this.d.B(aURAInputData, new a());
    }

    @Override // tb.un
    public void L(pt<OUTPUT> ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fb110e6", new Object[]{this, ptVar});
        } else {
            this.c = ptVar;
        }
    }
}
