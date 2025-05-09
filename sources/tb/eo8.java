package tb;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class eo8 implements mk8<fo8> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544235);
        t2o.a(961544297);
    }

    public final void a(fo8 fo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1fdc7ae", new Object[]{this, fo8Var});
            return;
        }
        long a2 = yu7.f().a(fo8Var.file, fo8Var.fileMd5, fo8Var.updateTime);
        if (a2 <= 0) {
            ogh.i("ExperimentBetaDataV5EventListener", "【实验数据】数据文件下载任务添加失败，任务ID：" + a2);
        }
    }

    @Override // tb.mk8
    public void onEvent(bj8<fo8> bj8Var) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("148a3e67", new Object[]{this, bj8Var});
            return;
        }
        ogh.g("ExperimentBetaDataV5EventListener", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT);
        if (bj8Var == null || bj8Var.c() == null) {
            ogh.g("ExperimentBetaDataV5EventListener", "【Beta实验数据】数据内容为空，停止处理！");
            return;
        }
        fo8 c = bj8Var.c();
        synchronized (this) {
            try {
                String str = bsq.g(n.j().o()) + c.fileMd5;
                if (TextUtils.equals(str, n.j().e().h())) {
                    ogh.i("ExperimentBetaDataV5EventListener", "【Beta实验数据V5】未发现新数据。本地数据签名：" + str);
                    return;
                }
                n.j().e().u(c.fileMd5);
                ku0.b(ku0.EXPERIMENT_DATA_REACH_TYPE, "" + bj8Var.a());
                try {
                    a(c);
                } catch (Throwable th) {
                    ku0.j("ExperimentBetaDataV5EventListener.onEvent", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
