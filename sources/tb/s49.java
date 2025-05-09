package tb;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.processor.FeatureCheckProcessor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s49 b = new s49();

    /* renamed from: a  reason: collision with root package name */
    public final List<czm> f27788a;

    static {
        t2o.a(951058442);
    }

    public s49() {
        ArrayList arrayList = new ArrayList();
        this.f27788a = arrayList;
        arrayList.add(new kg8());
        arrayList.add(new maq());
        arrayList.add(new x39());
        arrayList.add(new FeatureCheckProcessor());
        arrayList.add(new mt8());
        arrayList.add(new f49());
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1df07aa", new Object[]{str});
        } else {
            Toast.makeText(kjv.sContext, str, 0).show();
        }
    }

    public static s49 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s49) ipChange.ipc$dispatch("384616b", new Object[0]);
        }
        return b;
    }

    public final void c(czm czmVar, q49 q49Var) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6866e7", new Object[]{this, czmVar, q49Var});
        } else if (czmVar instanceof kg8) {
            if (q49Var.success) {
                str5 = "网络正常";
            } else {
                str5 = "网络异常";
            }
            showToast(str5);
        } else if (czmVar instanceof mt8) {
            if (q49Var.success) {
                str4 = "feature解压成功";
            } else {
                str4 = "feature解压失败";
            }
            showToast(str4);
        } else if (czmVar instanceof FeatureCheckProcessor) {
            if (q49Var.success) {
                str3 = "feature验证成功";
            } else {
                str3 = "feature验证失败";
            }
            showToast(str3);
        } else if (czmVar instanceof x39) {
            if (q49Var.success) {
                str2 = "feature下载成功";
            } else {
                str2 = "feature下载失败";
            }
            showToast(str2);
        } else if (czmVar instanceof f49) {
            if (q49Var.success) {
                str = "feature安装成功";
            } else {
                str = "feature安装失败";
            }
            showToast(str);
        }
    }

    public void execute(q49 q49Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("915da4da", new Object[]{this, q49Var, str});
            return;
        }
        Iterator it = ((ArrayList) this.f27788a).iterator();
        while (it.hasNext()) {
            long currentTimeMillis = System.currentTimeMillis();
            czm czmVar = (czm) it.next();
            czmVar.execute(q49Var);
            if (!q49Var.success) {
                if (str.equals(gjv.SCAN)) {
                    c(czmVar, q49Var);
                    return;
                } else {
                    t49.stat(false, q49Var.stage, System.currentTimeMillis() - currentTimeMillis, q49Var.errorCode, q49Var.errorMsg, q49Var.featureUpdateData.featureUpdateVersion);
                    return;
                }
            } else if (str.equals(gjv.SCAN)) {
                c(czmVar, q49Var);
            } else {
                t49.stat(true, q49Var.stage, System.currentTimeMillis() - currentTimeMillis, 0, "", q49Var.featureUpdateData.featureUpdateVersion);
            }
        }
    }

    public void rollBack(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db6fd295", new Object[]{this, str});
        } else {
            new f49().deprecatedHisUpdateVersion(str);
        }
    }

    public void showToast(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.r49
                @Override // java.lang.Runnable
                public final void run() {
                    s49.b(str);
                }
            });
        }
    }
}
