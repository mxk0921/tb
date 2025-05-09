package tb;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliNavServiceInterface;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class o5l extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_OPEN_URL_H5_OLD_COMPONENT = "__oldComponent";
    public static final String KEY_H5_DATA_PREFIX = "data=";
    public static final String KEY_H5_POST_DATA = "postdata";
    public static final String KEY_H5_QUERY_DATA = "querydata";
    public static final String KEY_MAIN_BIZ_NAME = "ultronTrade";
    public static final String KEY_OPEN_URL_H5_IS_POST_URL = "isPostUrl";
    public static final String TYPE_OPEN_URL_H5 = "H5";
    public static final String TYPE_OPEN_URL_METHOD_GET = "get";
    public static final String TYPE_OPEN_URL_METHOD_POST = "post";
    public static final String TYPE_OPEN_URL_NATIVE = "Native";
    public static final String TYPE_OPEN_URL_POPLAYER = "PopLayer";
    public static final String TYPE_OPEN_URL_WEEX = "Weex";
    public int j = 100;

    static {
        t2o.a(157286524);
    }

    public o5l() {
        e();
    }

    public static /* synthetic */ Object ipc$super(o5l o5lVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/OpenUrlSubscriber");
    }

    public void C(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea19e455", new Object[]{this, str, jSONObject});
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
        if (r6.equals("Weex") == false) goto L_0x00e4;
     */
    @Override // tb.l6v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(tb.b8v r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o5l.t(tb.b8v):void");
    }

    public final String x(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f31b0b24", new Object[]{this, str, jSONObject});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            if (!(entry == null || TextUtils.isEmpty(entry.getKey()) || entry.getValue() == null)) {
                buildUpon.appendQueryParameter(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return buildUpon.build().toString();
    }

    public void z(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("512971bf", new Object[]{this, str, jSONObject});
            return;
        }
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            for (String str2 : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str2)) {
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str2, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str2, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str2, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        bundle.putString(str2, (String) obj);
                    } else if (obj instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj);
                    }
                }
            }
        }
        AliNavServiceInterface c = xq0.c();
        if (c != null) {
            c.a(this.b).b(this.j).d(bundle).c(str);
        } else if (yv6.b(this.b)) {
            Toast.makeText(this.b, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
        }
    }

    public void A(String str, JSONObject jSONObject) {
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f421c56", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            if (Uri.parse(str).getScheme() == null) {
                str = h1p.HTTPS_PREFIX + parse.getSchemeSpecificPart();
            }
            try {
                StringBuilder sb = new StringBuilder("poplayer://abcd?openType=directly&uuid=");
                sb.append(System.currentTimeMillis());
                sb.append("&params=");
                sb.append(URLEncoder.encode("{\"url\":\"" + str + "\"}", "UTF-8"));
                String sb2 = sb.toString();
                AliNavServiceInterface c = xq0.c();
                if (c != null) {
                    c.a(this.b).c(sb2);
                } else if (yv6.b(this.b)) {
                    Toast.makeText(this.b, "com.taobao.android:alinavimp:xx.xx.xx 没有引入，请实现接口适配导航库", 0).show();
                }
            } catch (Throwable th) {
                UnifyLog.m(this.d.getBizName(), "OpenUrlSubscriber", "jumpToPoplayer error: " + Log.getStackTraceString(th), new String[0]);
                lbq.c(this.d.getBizName(), "OpenUrlSubscriber.jumpToPoplayer", th);
            }
        }
    }

    public void y(String str, JSONObject jSONObject, String str2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d677d53", new Object[]{this, str, jSONObject, str2});
            return;
        }
        String string = jSONObject != null ? jSONObject.getString("__oldComponent") : null;
        if (TextUtils.isEmpty(str2)) {
            str2 = "post";
        }
        if (string == null || jSONObject == null) {
            str2 = "get";
        }
        if ("get".equals(str2)) {
            xq0.c().a(this.b).b(this.j).c(str);
            return;
        }
        Bundle bundle = new Bundle();
        if (string != null) {
            try {
                String encode = Uri.encode(string);
                bundle.putString("postdata", "data=" + encode);
            } catch (Exception e) {
                UnifyLog.m(this.d.getBizName(), "OpenUrlSubscriber", "oldComponent encode 失败", string);
                lbq.c(this.d.getBizName(), "OpenUrlSubscriber.jumpToH5", e);
            }
        }
        bundle.putBoolean("isPostUrl", true);
        try {
            jSONObject2 = JSON.parseObject(string);
        } catch (Throwable unused) {
            jSONObject2 = new JSONObject();
        }
        xq0.c().a(this.b).b(this.j).d(bundle).g(xq0.c().a(this.b).f(str, jSONObject2));
    }
}
