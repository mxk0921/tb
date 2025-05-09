package tb;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lch implements bud {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wnq f23255a;
    public final Map<String, Boolean> b = new HashMap();
    public final aak c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Localization.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23256a;

        public a(Context context) {
            this.f23256a = context;
        }

        @Override // com.alibaba.ability.localization.Localization.a
        public void onChange(Language language, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c58b74d", new Object[]{this, language, str});
                return;
            }
            TLog.loge("LocationSwitchExtractor", "receive location change broadcast");
            boolean c = LocationHelper.c(this.f23256a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("location", c);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            lch.this.c(jSONObject.toString());
        }
    }

    public lch(wnq wnqVar, aak aakVar) {
        this.f23255a = wnqVar;
        this.c = aakVar;
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d957b4bc", new Object[]{this, str})).booleanValue();
        }
        return ((Boolean) ((HashMap) this.b).get(str)).booleanValue();
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        Localization.a(new a(context));
        ((HashMap) this.b).put("location", Boolean.valueOf(LocationHelper.c(context)));
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf1a8b42", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            ((HashMap) this.b).clear();
            ((HashMap) this.b).put("location", Boolean.valueOf(jSONObject.getBoolean("location")));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.c.d();
        if (TBRevisionSwitchManager.e) {
            this.c.c();
        }
    }
}
