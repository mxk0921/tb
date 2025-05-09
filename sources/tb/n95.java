package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.social.sdk.net.ISocialBusinessListener;
import mtopsdk.mtop.domain.MtopResponse;
import tb.wu4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class n95 implements dtb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ etb f24582a;

        public a(n95 n95Var, etb etbVar) {
            this.f24582a = etbVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                return;
            }
            etb etbVar = this.f24582a;
            if (etbVar != null) {
                etbVar.onError(str);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                return;
            }
            etb etbVar = this.f24582a;
            if (etbVar != null) {
                etbVar.onSuccess(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ etb f24583a;

        public b(n95 n95Var, etb etbVar) {
            this.f24583a = etbVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                return;
            }
            etb etbVar = this.f24583a;
            if (etbVar != null) {
                etbVar.onError(str);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                return;
            }
            etb etbVar = this.f24583a;
            if (etbVar != null) {
                etbVar.onSuccess(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ISocialBusinessListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ etb f24584a;

        public c(n95 n95Var, etb etbVar) {
            this.f24584a = etbVar;
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onError(ISocialBusinessListener.ErrorType errorType, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b26a5e33", new Object[]{this, errorType, str, str2});
                return;
            }
            etb etbVar = this.f24584a;
            if (etbVar != null) {
                etbVar.onError(str);
            }
        }

        @Override // com.taobao.social.sdk.net.ISocialBusinessListener
        public void onSuccess(MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eb9888c", new Object[]{this, mtopResponse, obj});
                return;
            }
            etb etbVar = this.f24584a;
            if (etbVar != null) {
                etbVar.onSuccess(mtopResponse.getDataJsonObject());
            }
        }
    }

    static {
        t2o.a(451936283);
        t2o.a(452985038);
    }

    public void a(long j, long j2, etb etbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db972fe", new Object[]{this, new Long(j), new Long(j2), etbVar});
        } else {
            s8q.getInstance().cancelLike(j, j2, new b(this, etbVar));
        }
    }

    public void b(long j, String str, etb etbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bb63d1d", new Object[]{this, new Long(j), str, etbVar});
        } else {
            s8q.getInstance().getCountAndStatus(new wu4(new wu4.a().setTargetIds(new String[]{str}).setLikeNamespace(j).setLikeCount(true).setLikeStatus(true)), new c(this, etbVar));
        }
    }

    public void c(long j, long j2, String str, etb etbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c116f2e", new Object[]{this, new Long(j), new Long(j2), str, etbVar});
        } else {
            s8q.getInstance().like(j, j2, str, new a(this, etbVar));
        }
    }
}
