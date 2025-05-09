package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mrm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String FEATURE_NAME = "preloadFirstChunk";
    public static final String PRELOAD_FIRST_CHUNK_INTERVAL_TIME = "preloadFirstChunkIntervalTime";
    public static final String PRELOAD_FIRST_CHUNK_MAX_SIZE = "preloadFirstChunkMaxSize";
    public static final String TAG = "PreloadFirstChunkService";

    /* renamed from: a  reason: collision with root package name */
    public final hhc.a f24257a;
    public final hhc b;
    public final fdc c;
    public final q1x d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(490733603);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "preloadFirstChunk";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
                return;
            }
            ckf.g(aVar, "callback");
            if (!z1x.b(TMSEmbedSolutionType.WEB_SINGLE_PAGE.name(), z1x.H5_PRELOAD_FIRST_CHUNK)) {
                fve.e(mrm.TAG, "uc降级场景不预加载");
                ((mvf) aVar).c("uc降级场景不预加载");
            } else if (TextUtils.equals("topMutliTab", mrm.a(mrm.this).e())) {
                List<String> C = mrm.a(mrm.this).C("getSelectPopWebUrl");
                mrm.d(mrm.this, C);
                fve.e(mrm.TAG, "下拉框预加载，链接条数有：" + C.size());
                ((mvf) aVar).d("下拉框预加载，链接条数有：" + C.size());
            } else {
                List c = mrm.c(mrm.this, jSONObject);
                mrm.d(mrm.this, c);
                ((mvf) aVar).d("实验室版本预加载，链接条数有：" + c.size());
                fve.e(mrm.TAG, "实验室版本，链接条数有：" + c.size());
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;

        public c(List list, int i) {
            this.b = list;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                mrm.b(mrm.this).o((String) this.b.get(this.c));
            }
        }
    }

    static {
        t2o.a(490733602);
    }

    public mrm(hhc hhcVar, fdc fdcVar, q1x q1xVar) {
        ckf.g(hhcVar, "mJsBridgeServiceImpl");
        ckf.g(fdcVar, "mCallBack");
        ckf.g(q1xVar, "mWebViewProvider");
        this.b = hhcVar;
        this.c = fdcVar;
        this.d = q1xVar;
        hhc.a e = e();
        this.f24257a = e;
        hhcVar.a(e);
    }

    public static final /* synthetic */ fdc a(mrm mrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdc) ipChange.ipc$dispatch("d32636ba", new Object[]{mrmVar});
        }
        return mrmVar.c;
    }

    public static final /* synthetic */ q1x b(mrm mrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q1x) ipChange.ipc$dispatch("9a732b1d", new Object[]{mrmVar});
        }
        return mrmVar.d;
    }

    public static final /* synthetic */ List c(mrm mrmVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87612424", new Object[]{mrmVar, jSONObject});
        }
        return mrmVar.f(jSONObject);
    }

    public static final /* synthetic */ void d(mrm mrmVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ea6cc98", new Object[]{mrmVar, list});
        } else {
            mrmVar.h(list);
        }
    }

    public final hhc.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("59e5a644", new Object[]{this});
        }
        return new b();
    }

    public final List<String> f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a322268a", new Object[]{this, jSONObject});
        }
        String string = jSONObject != null ? jSONObject.getString("preloadFirstChunkStrategy") : null;
        fve.e(TAG, "实验室版本，当前策略是：" + string);
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != -1793320594) {
                if (hashCode != 1195314547) {
                    if (hashCode == 2061403050 && string.equals("getRightTabWebUrl")) {
                        List<String> C = this.c.C("getRightTabWebUrl");
                        ckf.f(C, "mCallBack.getWebPerforma…st.GET_RIGHT_TAB_WEB_URL)");
                        return C;
                    }
                } else if (string.equals("getLeftTabWebUrl")) {
                    List<String> C2 = this.c.C("getLeftTabWebUrl");
                    ckf.f(C2, "mCallBack.getWebPerforma…nst.GET_LEFT_TAB_WEB_URL)");
                    return C2;
                }
            } else if (string.equals("getLeftAndRightTabWebUrl")) {
                List<String> C3 = this.c.C("getLeftAndRightTabWebUrl");
                ckf.f(C3, "mCallBack.getWebPerforma…FT_AND_RIGHT_TAB_WEB_URL)");
                return C3;
            }
        }
        return new ArrayList();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.b.b(this.f24257a);
        }
    }

    public final void h(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89a44fe", new Object[]{this, list});
            return;
        }
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            fve.e(TAG, "pageUrlList 为空或者size = 0");
            return;
        }
        int min = Math.min(mve.c(PRELOAD_FIRST_CHUNK_MAX_SIZE, 5), list.size());
        int c2 = mve.c(PRELOAD_FIRST_CHUNK_INTERVAL_TIME, 1000);
        for (int i = 0; i < min; i++) {
            get.a().f(new c(list, i), c2);
        }
    }
}
