package tb;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.ImageStrategyDecider;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rws {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355561);
    }

    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bfca87d", new Object[]{this, application});
        } else {
            Coordinator.postTask(new a("batchFetchImage", application));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f27653a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Application application) {
            super(str);
            this.f27653a = application;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/launcherx/TaoLiveImagePreLoad$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONArray parseArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            s0m B = s0m.B();
            String string = this.f27653a.getSharedPreferences("taobao_live_home", 0).getString("jingxuanFirstPageImageSp", "");
            if (!(TextUtils.isEmpty(string) || (parseArray = JSON.parseArray(string)) == null || parseArray.size() <= 0)) {
                for (int i = 0; i < parseArray.size(); i++) {
                    JSONObject jSONObject = parseArray.getJSONObject(i);
                    if (jSONObject != null) {
                        String string2 = jSONObject.getString("imageUrl");
                        Integer integer = jSONObject.getInteger("width");
                        int intValue = integer.intValue();
                        Integer integer2 = jSONObject.getInteger("height");
                        int intValue2 = integer2.intValue();
                        if (!TextUtils.isEmpty(string2) && intValue > 0 && intValue2 > 0) {
                            B.T(ImageStrategyDecider.decideUrl(string2, integer, integer2, null)).limitSize(null, intValue, intValue2).fetch();
                        }
                    }
                }
                TLog.loge("TaoLiveNewHomePage", "TaoLiveImagePreLoad batchFetchImage");
            }
        }
    }
}
