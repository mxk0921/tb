package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.log.RSoLog;
import tb.tu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nu7 implements ggd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements tu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f24952a = false;
        public final xan b;

        public a(xan xanVar) {
            this.b = xanVar;
        }

        @Override // tb.tu7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
                return;
            }
            RSoLog.a(this.b.h() + " -- onDownloadError  url=" + str + ", errorCode=" + i + ", msg = " + str2);
            fgd c = this.b.c();
            xan xanVar = this.b;
            c.a(xanVar, RSoException.error(3001, i + ":" + str2 + "->" + str));
        }

        @Override // tb.tu7
        public void onDownloadFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43d7a315", new Object[]{this, str, str2});
                return;
            }
            RSoLog.a(this.b.h() + " -- onDownloadFinish  url=" + str + ", filePath" + str2);
            this.b.c().a(this.b, null);
        }

        @Override // tb.tu7
        public void onDownloadProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                return;
            }
            if (i % 5 == 0) {
                RSoLog.a(this.b.h() + " -- onDownloadProgress  progress=" + i);
            }
            this.b.c().b(this.b, i);
        }

        @Override // tb.tu7
        public void onDownloadStateChange(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98fdb789", new Object[]{this, str, new Boolean(z)});
            } else if (z && !this.f24952a) {
                this.f24952a = true;
                RSoLog.d(this.b.h() + " -- onDownloadBegin  url=" + str);
                this.b.c().c(this.b);
            }
        }

        @Override // tb.tu7
        public void onFinish(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                return;
            }
            RSoLog.d(this.b.h() + " -- onFinish  allSuccess=" + z);
        }

        @Override // tb.tu7
        public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                return;
            }
            RSoLog.d(this.b.h() + " -- onNetworkLimit  netType=" + i);
        }
    }

    @Override // tb.ggd
    public void a(yan yanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53dd7474", new Object[]{this, yanVar});
        } else {
            rv7.e().h(c(yanVar));
        }
    }

    @Override // tb.ggd
    public yan b(xan xanVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yan) ipChange.ipc$dispatch("4fc67b55", new Object[]{this, xanVar});
        }
        RSoLog.a(xanVar.h() + " -- start Download Task request=" + xanVar);
        zu7 zu7Var = new zu7();
        zu7Var.b.g = xanVar.f();
        upl uplVar = zu7Var.b;
        if (xanVar.k()) {
            str = "remoteso_preload";
        } else {
            str = "remoteso";
        }
        uplVar.f29547a = str;
        onf onfVar = new onf();
        onfVar.f25507a = xanVar.j();
        onfVar.c = xanVar.i();
        onfVar.d = xanVar.h();
        long e = xanVar.e();
        if (e >= 0) {
            onfVar.b = e;
        }
        zu7Var.f33016a.add(onfVar);
        return new yan(xanVar, Integer.valueOf(rv7.e().b(zu7Var, new a(xanVar))));
    }

    public final int c(yan yanVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8b9dbacd", new Object[]{this, yanVar})).intValue();
        }
        Object b = yanVar.b();
        if (b instanceof Integer) {
            int intValue = ((Integer) b).intValue();
            if (intValue != -100) {
                return intValue;
            }
            throw new RuntimeException("taskDesc == DownloadErrorCode.ERROR_PARAM, it should be taskId");
        }
        throw new RuntimeException("taskDesc is not an integer, it should be taobao downloader taskId");
    }
}
