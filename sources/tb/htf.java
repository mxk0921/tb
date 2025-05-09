package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.search.musie.MUSXSearchEventModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.contrib.tmall.sqlite.Cursor;
import org.tensorflow.contrib.tmall.sqlite.DbManager;
import tb.itf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class htf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static htf f20885a;
    public static final String[] b = {"seqId", "sessionId", "bizId", "scene", "createTime", StWindow.UPDATE_TIME, "userId", "actionType", "actionName", "actionDuration", "actionArgs", "bizArgs", yj4.PARAM_IS_FIRST_ENTER, "fromScene", "toScene", "reserve1", "reserve2", "dc_create_time"};

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements fo6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(htf htfVar) {
        }

        @Override // tb.fo6
        public void errorReport(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            }
        }

        @Override // tb.fo6
        public void notify(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20887a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ k49 d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements itf.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public void a(Boolean bool) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44c2dfea", new Object[]{this, bool});
                } else if (bool.booleanValue()) {
                    k49 k49Var = c.this.d;
                    if (k49Var != null) {
                        ((MUSXSearchEventModule.k) k49Var).b(null, null);
                    }
                } else {
                    k49 k49Var2 = c.this.d;
                    if (k49Var2 != null) {
                        ((MUSXSearchEventModule.k) k49Var2).a("error", "");
                    }
                }
            }
        }

        public c(String str, ArrayList arrayList, ArrayList arrayList2, k49 k49Var) {
            this.f20887a = str;
            this.b = arrayList;
            this.c = arrayList2;
            this.d = k49Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                itf.i().j(this.f20887a, this.b, this.c, new a());
            }
        }
    }

    public static /* synthetic */ String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("cc58b86", new Object[0]);
        }
        return b;
    }

    public static synchronized htf b() {
        synchronized (htf.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (htf) ipChange.ipc$dispatch("68d4a8d2", new Object[0]);
            }
            if (f20885a == null) {
                f20885a = new htf();
            }
            return f20885a;
        }
    }

    public void c(String str, String str2, k49 k49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2aa0e65", new Object[]{this, str, str2, k49Var});
        } else {
            Coordinator.execute(new a(str, k49Var, str2));
        }
    }

    public void d(String str, k49 k49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a70ff9af", new Object[]{this, str, k49Var});
        } else {
            c("Page_SearchItemList", str, k49Var);
        }
    }

    public void e(String str, ArrayList<String> arrayList, ArrayList<Map> arrayList2, k49 k49Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cac7d29", new Object[]{this, str, arrayList, arrayList2, k49Var});
        } else {
            Coordinator.execute(new c(str, arrayList, arrayList2, k49Var));
        }
    }

    public void f(String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f4792c", new Object[]{this, str, bundle});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : bundle.keySet()) {
                jSONObject2.put(str2, bundle.get(str2));
            }
            JSONObject parseObject = JSON.parseObject(str);
            jSONObject.put("triggerType", (Object) "bx_trigger");
            jSONObject.put(ru1.FEATURE_CONTENT, (Object) parseObject);
            jSONObject.put(ru1.TRIGGER_CONTENT, (Object) jSONObject2);
            gtf.i().o("Detail", qsf.EVENT_DESTORY, prl.b(jSONObject), new b(this));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20886a;
        public final /* synthetic */ k49 b;
        public final /* synthetic */ String c;

        public a(String str, k49 k49Var, String str2) {
            this.f20886a = str;
            this.b = k49Var;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < htf.a().length; i++) {
                    sb.append(htf.a()[i]);
                    if (i != htf.a().length - 1) {
                        sb.append(",");
                    }
                }
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("data_names", "dc_userBehavior_request_node");
                Cursor query = DbManager.getInstance().query("select " + sb2 + " from dc_userBehavior_request_node where scene='" + this.f20886a + "' and actionType='request' order by seqId desc limit 5", null, "JarvisFeature", "getPVFeature", hashMap);
                if (query == null) {
                    ((MUSXSearchEventModule.k) this.b).b(this.c, "");
                    return;
                }
                while (query.moveToNext()) {
                    if (this.c.equals(frq.e(query.getString(11), ",", "=", true).get("query"))) {
                        hashMap.put("data_names", "dc_userBehavior_expose_node,dc_userBehavior_new_edge");
                        Cursor query2 = DbManager.getInstance().query("SELECT " + sb2 + " FROM dc_userBehavior_expose_node WHERE seqId IN (SELECT rightNode from dc_userBehavior_new_edge where leftNode in (" + query.getInt(0) + ") AND leftActionType = 'request' AND rightActionType = 'expose') ", null, "JarvisFeature", "getPVFeature", hashMap);
                        hashMap.put("data_names", "dc_userBehavior_tap_node,dc_userBehavior_new_edge");
                        Cursor query3 = DbManager.getInstance().query("SELECT " + sb2 + " FROM dc_userBehavior_tap_node WHERE seqId IN (SELECT rightNode from dc_userBehavior_new_edge where leftNode in (" + query.getInt(0) + ") AND leftActionType = 'request' AND rightActionType = 'tap') ", null, "JarvisFeature", "getPVFeature", hashMap);
                        ArrayList arrayList2 = new ArrayList();
                        if (!(query3 == null || query2 == null)) {
                            while (query3.moveToNext()) {
                                arrayList2.add(query3.getString(2));
                            }
                            query3.close();
                            while (query2.moveToNext()) {
                                String string = query2.getString(2);
                                if (!arrayList2.contains(string) && !arrayList.contains(string)) {
                                    arrayList.add(string);
                                }
                            }
                            query2.close();
                        }
                    }
                }
                query.close();
                StringBuilder sb3 = new StringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    sb3.append(arrayList.get(i2));
                    if (i2 != arrayList.size() - 1) {
                        sb3.append(";");
                    }
                }
                ((MUSXSearchEventModule.k) this.b).b(this.c, sb3.toString());
            } catch (Throwable th) {
                ((MUSXSearchEventModule.k) this.b).a("getPvFeature", th.getMessage());
                th.printStackTrace();
            }
        }
    }

    static {
        t2o.a(1034944540);
    }
}
