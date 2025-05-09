package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mo8 extends cu1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RELEASE_FILE = "release";
    public final long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24179a;

        public a(String str) {
            this.f24179a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ro8 f = go8.f(this.f24179a, "release");
                if (f == null) {
                    ogh.i("ExperimentFileV5DownloadListener", "【实验数据V5】数据解析错误，文件地址：" + this.f24179a);
                } else if (mo8.d(mo8.this) == n.j().e().n()) {
                    ogh.i("ExperimentFileV5DownloadListener", "【实验数据V5】数据未发现变化，本地版本：" + f.b);
                } else {
                    n.j().e().l(f.c, f.d, f.b, f.f27497a);
                }
            } catch (Throwable th) {
                ku0.j("ExperimentFileV5DownloadListener.onDownloadFinish", th);
                ogh.j("ExperimentFileV5DownloadListener", "解析实验文件过程中出现错误，" + th.getMessage(), th);
                n.j().e().j(null);
            }
        }
    }

    static {
        t2o.a(961544231);
    }

    public mo8(long j) {
        this.b = j;
    }

    public static /* synthetic */ long d(mo8 mo8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("caf5becc", new Object[]{mo8Var})).longValue();
        }
        return mo8Var.b;
    }

    public static /* synthetic */ Object ipc$super(mo8 mo8Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -864932293) {
            super.onDownloadError((String) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2]);
            return null;
        } else if (hashCode == 1138205461) {
            super.onDownloadFinish((String) objArr[0], (String) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/evo/internal/downloader/ExperimentFileV5DownloadListener");
        }
    }

    @Override // tb.cu1
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38f75f91", new Object[]{this});
        }
        return "实验数据";
    }

    @Override // tb.cu1
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4fe27f3b", new Object[]{this});
        }
        return "ExperimentV5";
    }

    @Override // tb.cu1, tb.tu7
    public void onDownloadError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        super.onDownloadError(str, i, str2);
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
