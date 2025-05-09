package com.taobao.family;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import tb.a09;
import tb.b09;
import tb.c09;
import tb.fsw;
import tb.h6j;
import tb.lqw;
import tb.puv;
import tb.pvf;
import tb.sm2;
import tb.vlp;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyManager implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_KEY_OLD_PEOPLE = "social_oldPeople_";
    public static final String SP_KEY_REMARK = "social_remarkName_";
    private static Application application;
    private static String currentUserId;
    public static volatile a09 dataStoreComponent;
    public static List<sm2> bubbleListeners = new CopyOnWriteArrayList();
    private static boolean init = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FamilyManager.sendGetFamilyRelationRequest();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ sm2 f10507a;

        public b(sm2 sm2Var) {
            this.f10507a = sm2Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (FamilyManager.dataStoreComponent == null) {
                FamilyManager.dataStoreComponent = new a09(FamilyManager.access$100());
            }
            String a2 = FamilyManager.dataStoreComponent.a(Login.getUserId());
            if (TextUtils.isEmpty(a2)) {
                this.f10507a.a(new ArrayList());
                this.f10507a.b(new ArrayList());
                return;
            }
            try {
                jSONObject = new JSONObject(a2);
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject = null;
            }
            if (jSONObject == null) {
                this.f10507a.a(new ArrayList());
                this.f10507a.b(new ArrayList());
                return;
            }
            FamilyMembers familyMembers = new FamilyMembers(jSONObject);
            this.f10507a.a(familyMembers.getBubbleDisplayList());
            this.f10507a.b(familyMembers.getRelationShip());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMembers f10508a;

        public c(FamilyMembers familyMembers) {
            this.f10508a = familyMembers;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String userId = Login.getUserId();
            if (!TextUtils.isEmpty(userId)) {
                if (FamilyManager.dataStoreComponent == null) {
                    FamilyManager.dataStoreComponent = new a09(FamilyManager.access$100());
                }
                FamilyManager.dataStoreComponent.c(this.f10508a.jsonObject.toString(), userId);
                HashMap hashMap = new HashMap();
                hashMap.put(FamilyManager.SP_KEY_REMARK + userId, this.f10508a.getOrderString());
                String str2 = FamilyManager.SP_KEY_OLD_PEOPLE + userId;
                if (this.f10508a.isOldPeople()) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str2, str);
                vlp.d(hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements h6j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.h6j
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63fe84e", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                y7t.a("FamilyManager", "mtop error response: " + jSONObject.toString());
            }
        }

        @Override // tb.h6j
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                new StringBuilder("mtop success response: ").append(jSONObject.toString());
                if (!jSONObject.toString().equals("{}")) {
                    FamilyManager.notifyListeners(new FamilyMembers(jSONObject), true);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return currentUserId;
    }

    public static /* synthetic */ String access$002(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d6fc06fd", new Object[]{str});
        }
        currentUserId = str;
        return str;
    }

    public static /* synthetic */ Application access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("57e7de87", new Object[0]);
        }
        return application;
    }

    public static synchronized void doInit(Application application2, HashMap<String, Object> hashMap) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91f834b6", new Object[]{application2, hashMap});
            } else if (application2 != null) {
                if (!init) {
                    init = true;
                    application = application2;
                    currentUserId = Login.getUserId();
                    c09.a();
                    LoginBroadcastHelper.registerLoginReceiver(application2, new BroadcastReceiver() { // from class: com.taobao.family.FamilyManager.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/FamilyManager$1");
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            LoginAction valueOf;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                            } else if (intent != null && (valueOf = LoginAction.valueOf(intent.getAction())) != null) {
                                int i = e.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[valueOf.ordinal()];
                                if (i == 1) {
                                    String userId = Login.getUserId();
                                    if (!TextUtils.isEmpty(userId) && !userId.equals(FamilyManager.access$000())) {
                                        FamilyManager.sendGetFamilyRelationRequest();
                                        FamilyManager.access$002(userId);
                                    }
                                } else if (i == 2) {
                                    FamilyManager.access$002(null);
                                    FamilyManager.notifyListeners(new FamilyMembers(), false);
                                }
                            }
                        }
                    });
                    fsw.h(FamilyWVApiPlugin.JS_BRIDGE_CLASSNAME, FamilyWVApiPlugin.class);
                    lqw.d().b(new pvf());
                    if (b09.c.f16111a) {
                        new Handler(Looper.getMainLooper()).post(new a());
                    }
                }
            }
        }
    }

    public static synchronized void notifyListeners(FamilyMembers familyMembers, boolean z) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47b87c2d", new Object[]{familyMembers, new Boolean(z)});
            } else if (familyMembers != null) {
                List<sm2> list = bubbleListeners;
                if (list != null && list.size() > 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("userId", currentUserId);
                    hashMap.put("relation", familyMembers.jsonObject.toString());
                    hashMap.put("count", String.valueOf(bubbleListeners.size()));
                    puv.a(puv.ARG1_NOTIFY_LISTENERS, hashMap);
                    new StringBuilder("notify listeners, count ").append(bubbleListeners.size());
                }
                for (sm2 sm2Var : bubbleListeners) {
                    if (sm2Var != null) {
                        sm2Var.a(familyMembers.getBubbleDisplayList());
                        sm2Var.b(familyMembers.getRelationShip());
                    }
                }
                if (z) {
                    saveDataInThread(familyMembers);
                }
            }
        }
    }

    public static synchronized void registerBubbleDisplayListener(sm2 sm2Var) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55dd7121", new Object[]{sm2Var});
            } else if (sm2Var != null) {
                doInit(Globals.getApplication(), null);
                bubbleListeners.add(sm2Var);
                if (TextUtils.isEmpty(Login.getUserId())) {
                    sm2Var.a(new ArrayList());
                    sm2Var.b(new ArrayList());
                    return;
                }
                AsyncTask.execute(new b(sm2Var));
            }
        }
    }

    private static void saveDataInThread(FamilyMembers familyMembers) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fa01107", new Object[]{familyMembers});
        } else {
            AsyncTask.execute(new c(familyMembers));
        }
    }

    public static void sendGetFamilyRelationRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a01ee8", new Object[0]);
        } else if (!TextUtils.isEmpty(Login.getUserId())) {
            FamilyMtopClient.f10509a.a(FamilyMtopClient.API_NAME_GET_FAMILY_RELATION, new HashMap(), new d());
        }
    }

    public static synchronized boolean unRegisterBubbleDisplayListener(sm2 sm2Var) {
        synchronized (FamilyManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("712c689e", new Object[]{sm2Var})).booleanValue();
            } else if (sm2Var == null) {
                return false;
            } else {
                return bubbleListeners.remove(sm2Var);
            }
        }
    }

    public void init(Application application2, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application2, hashMap});
        } else {
            doInit(application2, hashMap);
        }
    }
}
