package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xp7 extends tx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;

    static {
        t2o.a(491782291);
    }

    public xp7(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(xp7 xp7Var, String str, Object... objArr) {
        if (str.hashCode() == -497220968) {
            super.j((String) objArr[0], (String) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/cachereqbizparamsservice/impl/mode/DiskAutoErasedModeHandler");
    }

    @Override // tb.tx
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16a7de0c", new Object[]{this});
        }
        return "infoFlowAutoErasedBizParams_";
    }

    @Override // tb.tx
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2df9a19", new Object[]{this});
        } else {
            this.c = true;
        }
    }

    @Override // tb.tx
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ae57f9", new Object[]{this});
            return;
        }
        fve.e("DiskAutoErasedModeHandler", "onRequestSucceed isAutoClear : " + this.c);
        if (this.c) {
            b();
        }
    }

    @Override // tb.tx
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25d0298", new Object[]{this, str, str2});
            return;
        }
        super.j(str, str2);
        this.c = false;
    }
}
