package tb;

import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.result.SearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class emo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qlo f18678a;
    public final rlo b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y5p f18679a;

        public a(y5p y5pVar) {
            this.f18679a = y5pVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/xsearchplugin/unidata/SFTracking$1");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            emo.a(emo.this).c(this.f18679a);
            return null;
        }
    }

    static {
        t2o.a(993002174);
    }

    public emo(qlo qloVar, rlo rloVar) {
        this.f18678a = qloVar;
        this.b = rloVar;
    }

    public static /* synthetic */ qlo a(emo emoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlo) ipChange.ipc$dispatch("a68a4a66", new Object[]{emoVar});
        }
        return emoVar.f18678a;
    }

    public void onEvent(q6j q6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b765ad", new Object[]{this, q6jVar});
        } else if (q6jVar.f26548a) {
            qlo qloVar = this.f18678a;
            qloVar.f(q6jVar.b + "/" + q6jVar.c);
        } else {
            qlo qloVar2 = this.f18678a;
            qloVar2.e(q6jVar.b + "/" + q6jVar.c, q6jVar.d, q6jVar.e);
        }
    }

    public void onEvent(f5p f5pVar) {
        m1p m1pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734d8619", new Object[]{this, f5pVar});
            return;
        }
        SearchResult searchResult = f5pVar.f19032a;
        if (searchResult != null && (m1pVar = f5pVar.b) != null) {
            String d = ((nlo) this.b).d(m1pVar);
            String str = "nullError";
            if (searchResult.isFailed()) {
                ResultError error = searchResult.getError();
                String valueOf = error != null ? String.valueOf(error.getErrorCode()) : str;
                if (error != null) {
                    str = error.getErrorMsg();
                }
                this.f18678a.h(d, valueOf, str, f5pVar.c);
            } else if (!searchResult.hasListResult() || searchResult.bizRuleNoResult()) {
                this.f18678a.h(d, String.valueOf(9), str, f5pVar.c);
            } else {
                this.f18678a.i(d, f5pVar.c);
            }
        }
    }

    public void onEvent(y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96aaeca9", new Object[]{this, y5pVar});
        } else if (!y5pVar.b && !y5pVar.c) {
            new a(y5pVar).execute(new Void[0]);
        }
    }

    public void onEvent(qj9 qj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2453e2", new Object[]{this, qj9Var});
        } else {
            this.f18678a.b(qj9Var.b(), qj9Var.c(), qj9Var.a() - qj9Var.e(), qj9Var.d() == 0 ? 0L : qj9Var.a() - qj9Var.d());
        }
    }
}
