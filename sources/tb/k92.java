package tb;

import android.text.TextUtils;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class k92 extends cu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BETA_FILE = "beta";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22484a;

        public a(String str) {
            this.f22484a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ro8 f = go8.f(this.f22484a, "beta");
                if (f == null) {
                    ogh.i("BetaExperimentFileV5DownloadListener", "【Beta实验数据V5】数据解析错误，文件地址：" + this.f22484a);
                    return;
                }
                String str = bsq.g(n.j().o()) + f.f27497a;
                if (TextUtils.equals(str, n.j().e().s())) {
                    ogh.i("BetaExperimentFileV5DownloadListener", "【Beta实验数据V5】数据未发现变化，本地版本：" + f.b + "，本地签名：" + str);
                    return;
                }
                if (f.c == null) {
                    f.c = new ArrayList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) f.c).iterator();
                while (it.hasNext()) {
                    ExperimentV5 experimentV5 = (ExperimentV5) it.next();
                    if (experimentV5.getExpPublishType() == 6) {
                        arrayList.add(experimentV5);
                    }
                }
                if (!qo8.s().D(arrayList, 6)) {
                    n.j().e().u(null);
                    n.j().e().j(null);
                }
            } catch (Throwable th) {
                ku0.j("BetaExperimentFileV5DownloadListener.onDownloadFinish", th);
                n.j().e().u(null);
                n.j().e().j(null);
            }
        }
    }

    static {
        t2o.a(961544228);
    }

    public k92(long j, String str) {
    }

    public static /* synthetic */ Object ipc$super(k92 k92Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -864932293) {
            super.onDownloadError((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        } else if (hashCode == 1138205461) {
            super.onDownloadFinish((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/evo/internal/downloader/BetaExperimentFileV5DownloadListener");
        }
    }

    @Override // tb.cu1
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f75f91", new Object[]{this});
        }
        return "Beta实验数据";
    }

    @Override // tb.cu1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fe27f3b", new Object[]{this});
        }
        return "BetaExperimentV5";
    }

    @Override // tb.cu1, tb.tu7
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        super.onDownloadError(str, i, str2);
        n.j().e().u(null);
        n.j().e().j(null);
    }

    @Override // tb.cu1, tb.tu7
    public void onDownloadFinish(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
            return;
        }
        super.onDownloadFinish(str, str2);
        ydt.b(new a(str2));
    }
}
