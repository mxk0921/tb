package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ask.ASK_CONST$ERROR;
import com.taobao.ask.utils.MtopUtil;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import tb.r6h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d01 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public RemoteBusiness f17480a = null;
    public r6h.c b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements r6h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.r6h.a
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else if (d01.a(d01.this) != null) {
                d01.a(d01.this).cancelRequest();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements MtopUtil.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f17482a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;

        public b(String str, Context context, Map map, String str2) {
            this.f17482a = str;
            this.b = context;
            this.c = map;
            this.d = str2;
        }

        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            if (d01.b(d01.this) != null) {
                d01.b(d01.this).a();
            }
            String str3 = this.f17482a;
            ASK_CONST$ERROR ask_const$error = ASK_CONST$ERROR.INVALID_PARAMS;
            aix.callback(str3, false, false, ask_const$error.toJSONObject());
            zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error.toJSONObject());
            Toast.makeText(this.b, TextUtils.isEmpty(str2) ? "打开失败,请稍后重试" : str2, 0).show();
            TLog.loge("ASK", "check answered:,mtop error " + str + "," + str2);
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            if (d01.b(d01.this) != null) {
                d01.b(d01.this).a();
            }
            JSONObject jSONObject2 = jSONObject.containsKey("data") ? jSONObject.getJSONObject("data") : null;
            try {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("invite");
                if (jSONObject3 != null && !jSONObject3.isEmpty()) {
                    if (!jSONObject3.containsKey("answer") || jSONObject3.getJSONObject("answer").isEmpty()) {
                        this.c.put("cacheDataId", kq6.b().c(jSONObject2));
                        d01.d(this.b, this.c);
                        TLog.loge("ASK", "check answered:not have answerd , goNewPublish");
                        return;
                    }
                    String string = jSONObject3.getJSONObject("answer").getString("id");
                    if (!TextUtils.isEmpty(string)) {
                        this.c.put("answerId", string);
                        this.c.put("firstAnswerId", string);
                    }
                    this.c.put("id", this.d);
                    d01.c(this.b, this.c);
                    aix.callback(this.f17482a, false, false, ASK_CONST$ERROR.PUBLISHER_DEGRADED.toJSONObject());
                    TLog.loge("ASK", "check answered:have answerd , goAnsweredPage");
                    return;
                }
                String str = this.f17482a;
                ASK_CONST$ERROR ask_const$error = ASK_CONST$ERROR.INVALID_PARAMS;
                aix.callback(str, false, false, ask_const$error.toJSONObject());
                zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error.toJSONObject());
                Toast.makeText(this.b, "问题不见啦", 0).show();
                TLog.loge("ASK", "check answered:,invite is null");
            } catch (Exception e) {
                this.c.put("cacheDataId", kq6.b().c(jSONObject2));
                d01.d(this.b, this.c);
                TLog.loge("ASK", "check answered:have exception , goNewPublish " + e.getMessage());
            }
        }
    }

    static {
        t2o.a(817889298);
    }

    public static /* synthetic */ RemoteBusiness a(d01 d01Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("d9831f53", new Object[]{d01Var});
        }
        return d01Var.f17480a;
    }

    public static /* synthetic */ r6h.c b(d01 d01Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r6h.c) ipChange.ipc$dispatch("da8c5ee0", new Object[]{d01Var});
        }
        return d01Var.b;
    }

    public static /* synthetic */ void c(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abc97b6", new Object[]{context, map});
        } else {
            e(context, map);
        }
    }

    public static /* synthetic */ void d(Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8036bdf7", new Object[]{context, map});
        } else {
            g(context, map);
        }
    }

    public static void e(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee806458", new Object[]{context, map});
        } else {
            zc1.g(context, uc1.c("answerPublish_answeredRedirectUrl", "https://h5.m.taobao.com/tnode/index.htm?tnode=page_askdetail%40ugc%3fpangesture%3dpullrightexit%26navbarHide%3dtrue%26immersive%3dtrue&from=answer"), map);
        }
    }

    public static void f(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1451605", new Object[]{context, map});
        } else {
            zc1.g(context, uc1.c("answerPublish_degradedUrl", "https://web.m.taobao.com/app/mtb/ask-everyone/answer?pha=true&disableNav=YES"), map);
        }
    }

    public static void g(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef6f01b", new Object[]{context, map});
            return;
        }
        zc1.a(map, "tnodeTime", String.valueOf(System.nanoTime()));
        String str = map.get(RateInfoV2.KEY_OPEN_MODE);
        if (!"present".equals(str) && !"push".equals(str)) {
            map.put(RateInfoV2.KEY_OPEN_MODE, "push");
            str = "push";
        }
        zl2.a("TBAskEveryonePublisherWillOpen", null);
        String f = jd8.f();
        if (TextUtils.equals(str, "present")) {
            map.put(nbf.STDPOP_NAV_MODE, nbf.STDPOP_MODE_VALUE);
            map.put("stdpop_type", "maximum");
            map.put(nbf.STDPOP_MODE, "modal");
            map.put(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen");
        }
        zc1.g(context, f, map);
        TLog.loge("ASK", "open new answer publish using activity");
    }

    public final void h(Context context, Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57258b57", new Object[]{this, context, uri, map});
            return;
        }
        String str = map.get("sessionId");
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(System.currentTimeMillis());
            map.put("sessionId", str);
        }
        String str2 = map.get("scene");
        boolean b2 = zc1.b(map.get("callFromWindvane"), false);
        String str3 = map.get("questionId");
        boolean b3 = zc1.b(map.get("degradeWhenAnswerd"), true);
        if (TextUtils.isEmpty(str3)) {
            ASK_CONST$ERROR ask_const$error = ASK_CONST$ERROR.INVALID_PARAMS;
            aix.callback(str, false, false, ask_const$error.toJSONObject());
            zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error.toJSONObject());
            TLog.loge("ASK", "answer publish open failed , questionId is null");
        } else if (!jd8.a("answer", str2)) {
            TLog.loge("ASK", "open failed , answer publish is not enale");
            if (b2) {
                ASK_CONST$ERROR ask_const$error2 = ASK_CONST$ERROR.PUBLISHER_DEGRADED;
                aix.callback(str, false, false, ask_const$error2.toJSONObject());
                zl2.a("TBAskEveryonePublisherOpenFailed", ask_const$error2.toJSONObject());
                return;
            }
            f(context, map);
        } else if (b2 || !b3 || !jd8.c()) {
            TLog.loge("ASK", "don't need check answerd , goNewPublish");
            g(context, map);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("questionId", str3);
            this.b = r6h.a(context, new a());
            this.f17480a = MtopUtil.c("mtop.alibaba.ugc.ask.recommend.invite.question.get", null, hashMap, new b(str, context, map, str3));
        }
    }
}
