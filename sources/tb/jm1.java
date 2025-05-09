package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.behavir.event.BHREvent;
import tb.ru1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jm1 extends uct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements ru1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
            } else {
                jm1.this.d(jSONObject.getInnerMap());
            }
        }
    }

    static {
        t2o.a(404750401);
    }

    public jm1(BHRTaskConfigBase bHRTaskConfigBase, BHREvent bHREvent) {
        super(bHRTaskConfigBase, bHREvent);
    }

    public static /* synthetic */ Object ipc$super(jm1 jm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/task/BHRFeatureTask");
    }

    @Override // tb.uct
    public void g() {
        BHREvent bHREvent;
        ru1 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.b != null && (bHREvent = this.f29298a) != null) {
            JSONObject jsonObject = bHREvent.toJsonObject();
            JSONObject taskInfo = this.b.getTaskInfo();
            if (taskInfo != null && (a2 = w39.a(taskInfo.getString(ru1.FEATURE_NAME), taskInfo)) != null) {
                a2.c(jsonObject, new a());
            }
        }
    }
}
