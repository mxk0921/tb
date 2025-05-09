package com.taobao.family;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.login4android.api.Login;
import com.taobao.tao.util.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.c21;
import tb.h6j;
import tb.puv;
import tb.qj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyAccsService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f10502a = new Handler();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FamilyAccsService.this.sendBroadcast(new Intent("com.taobao.social.family.add"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f10504a;

        public b(JSONObject jSONObject) {
            this.f10504a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FamilyAccsService.a(FamilyAccsService.this, this.f10504a.optString("popEvent"), this.f10504a.optString("param"));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10505a;

        public c(String str) {
            this.f10505a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (FamilyAccsService.b(FamilyAccsService.this, c21.i(), this.f10505a)) {
                FamilyAccsService familyAccsService = FamilyAccsService.this;
                FamilyAccsService.a(familyAccsService, "poplayer://socialqinqinghao", "token=" + this.f10505a);
            }
        }
    }

    public static /* synthetic */ void a(FamilyAccsService familyAccsService, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb900f7", new Object[]{familyAccsService, str, str2});
        } else {
            familyAccsService.d(str, str2);
        }
    }

    public static /* synthetic */ boolean b(FamilyAccsService familyAccsService, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a0fb162", new Object[]{familyAccsService, activity, str})).booleanValue();
        }
        return familyAccsService.h(activity, str);
    }

    public static /* synthetic */ void c(FamilyAccsService familyAccsService, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740317ab", new Object[]{familyAccsService, str});
        } else {
            familyAccsService.g(str);
        }
    }

    public static /* synthetic */ Object ipc$super(FamilyAccsService familyAccsService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/FamilyAccsService");
    }

    public final void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e40ea09d", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
            intent.putExtra("event", str);
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("param", str2);
            }
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
            HashMap hashMap = new HashMap();
            hashMap.put("event", str);
            hashMap.put("param", str2);
            puv.a(puv.ARG1_POST_POPLAYER, hashMap);
        }
    }

    public final Map<String, String> e(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9e6224a5", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            String[] split = new URL(str).getQuery().split("&");
            if (split != null) {
                for (String str4 : split) {
                    int indexOf = str4.indexOf(61);
                    if (indexOf > 0) {
                        str2 = str4.substring(0, indexOf);
                        str3 = str4.substring(indexOf + 1);
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                    if (str3 != null) {
                        hashMap.put(str2, str3);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public final void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a194492f", new Object[]{this, jSONObject});
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("token");
            if (!TextUtils.isEmpty(optString)) {
                HashMap hashMap = new HashMap();
                hashMap.put("token", optString);
                FamilyMtopClient.f10509a.a(FamilyMtopClient.API_NAME_ACCS_CHECK, hashMap, new d(optString));
            }
        }
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f62f2e80", new Object[]{this, str});
        } else {
            this.f10502a.postDelayed(new c(str), 3000L);
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7a087d", new Object[]{this, new Boolean(z), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df10c6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.TaoBaseService, com.taobao.accs.base.AccsDataListener
    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e46188f6", new Object[]{this, connectInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements h6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10506a;

        public d(String str) {
            this.f10506a = str;
        }

        @Override // tb.h6j
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fe84e", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.h6j
        public void a(JSONObject jSONObject) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                if (jSONObject.optInt("isPop") != 1) {
                    z = false;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("token", this.f10506a);
                hashMap.put("userId", Login.getUserId());
                hashMap.put("display", String.valueOf(z));
                puv.a(puv.ARG1_ACCS_CHECK, hashMap);
                Login.getUserId();
                String str = this.f10506a;
                if (z) {
                    FamilyAccsService.c(FamilyAccsService.this, str);
                }
            }
        }
    }

    public final boolean h(Activity activity, String str) {
        Intent intent;
        String str2;
        Map<String, String> e;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2a3315f6", new Object[]{this, activity, str})).booleanValue();
        }
        if (activity == null || (intent = activity.getIntent()) == null) {
            return true;
        }
        if (activity.getClass().getSimpleName().equals("BrowserActivity")) {
            str2 = intent.getDataString();
            if (TextUtils.isEmpty(str2)) {
                try {
                    str2 = intent.getStringExtra(Constants.MYBROWSERURL);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        } else {
            str2 = null;
        }
        if (activity.getClass().getSimpleName().equals("WXActivity")) {
            str2 = intent.getStringExtra(qj4.e);
        }
        return TextUtils.isEmpty(str2) || (e = e(str2)) == null || e.size() == 0 || (str3 = e.get("token")) == null || !str3.equals(str);
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        String str4;
        int optInt;
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        JSONObject jSONObject = null;
        try {
            str4 = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            HashMap hashMap = new HashMap();
            hashMap.put("userId", str2);
            hashMap.put("data", str4);
            hashMap.put("dataId", str3);
            puv.a(puv.ARG1_RECEIVE_ACCS, hashMap);
            try {
                jSONObject = new JSONObject(str4);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (jSONObject != null && (optInt = jSONObject.optInt("type", 0)) != 0) {
                if (optInt == 1) {
                    f(jSONObject);
                } else if (optInt == 4) {
                    FamilyManager.sendGetFamilyRelationRequest();
                } else if (optInt == 2 || optInt == 3) {
                    FamilyManager.sendGetFamilyRelationRequest();
                    if (optInt == 2) {
                        this.f10502a.postDelayed(new a(), 1000L);
                    }
                } else if (optInt == 5 && (optJSONObject = jSONObject.optJSONObject("data")) != null) {
                    this.f10502a.postDelayed(new b(optJSONObject), 3000L);
                }
            }
        }
    }
}
