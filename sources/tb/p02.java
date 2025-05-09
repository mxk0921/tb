package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class p02 implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792262);
        t2o.a(578814049);
    }

    public void onHitOldActivity(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ab31f0", new Object[]{this, intent, zmjVar});
            return;
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(zmjVar, "navContext");
    }

    public boolean onPreJudge(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb10323", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        ckf.g(zmjVar, "navContext");
        return false;
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null) {
            return true;
        }
        try {
            onPreJudge(intent, zmjVar);
            onHitOldActivity(intent, zmjVar);
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
