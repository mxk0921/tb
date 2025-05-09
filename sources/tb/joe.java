package tb;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.sp.framework.model.SimpleProfile;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class joe extends ua0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<Activity> f22111a;
    public final Uri b;
    public final int c;
    public final Intent d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a<T> {
        void a(T t);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22112a;
        public final /* synthetic */ JSONArray b;

        public b(a aVar, JSONArray jSONArray) {
            this.f22112a = aVar;
            this.b = jSONArray;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22112a.a(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONArray f22113a;
        public final /* synthetic */ Integer b;
        public final /* synthetic */ a c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                cVar.c.a(cVar.f22113a);
            }
        }

        public c(JSONArray jSONArray, Integer num, a aVar) {
            this.f22113a = jSONArray;
            this.b = num;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Iterator<Object> it = this.f22113a.iterator();
            ckf.f(it, "data.iterator()");
            while (true) {
                JSONObject jSONObject = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        jSONObject = next;
                    }
                    JSONObject jSONObject2 = jSONObject;
                    if (jSONObject2 != null) {
                        jSONObject2.put((JSONObject) "thumbBase64", woe.INSTANCE.e(jSONObject2.getString("thumbPath"), this.b, new BitmapFactory.Options()));
                    }
                } else {
                    MegaUtils.A(new a(), 0L, 2, null);
                    return;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d implements a<JSONArray> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ a d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements a<JSONArray> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            /* renamed from: b */
            public void a(JSONArray jSONArray) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("249940a0", new Object[]{this, jSONArray});
                } else {
                    d.this.d.a(jSONArray);
                }
            }
        }

        public d(boolean z, int i, a aVar) {
            this.b = z;
            this.c = i;
            this.d = aVar;
        }

        /* renamed from: b */
        public void a(JSONArray jSONArray) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("249940a0", new Object[]{this, jSONArray});
            } else {
                joe.b(joe.this, jSONArray, this.b, Integer.valueOf(this.c), new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class e implements t1e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ JSONArray c;
        public final /* synthetic */ JSONArray d;
        public final /* synthetic */ a e;
        public final /* synthetic */ JSONObject f;

        public e(Ref$ObjectRef ref$ObjectRef, JSONArray jSONArray, JSONArray jSONArray2, a aVar, JSONObject jSONObject) {
            this.b = ref$ObjectRef;
            this.c = jSONArray;
            this.d = jSONArray2;
            this.e = aVar;
            this.f = jSONObject;
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a54b2", new Object[]{this});
            } else if (((HashMap) this.b.element).size() == this.c.size()) {
                Iterator<Object> it = this.c.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    HashMap hashMap = (HashMap) this.b.element;
                    String str = null;
                    if (!(next instanceof JSONObject)) {
                        next = null;
                    }
                    JSONObject jSONObject = (JSONObject) next;
                    if (jSONObject != null) {
                        str = jSONObject.getString("path");
                    }
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(str);
                    if (jSONObject2 != null) {
                        this.d.add(jSONObject2);
                    }
                }
                this.e.a(this.d);
            }
        }

        @Override // tb.t1e
        public void onExportCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33f959e", new Object[]{this, str});
                return;
            }
            if (str == null) {
                str = this.f.getString("path");
            }
            ((HashMap) this.b.element).put(str, joe.this.f(this.f));
            a();
        }

        @Override // tb.t1e
        public void onExportFail(String str, int i, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6ca07d5", new Object[]{this, str, new Integer(i), str2, str3});
                return;
            }
            ((HashMap) this.b.element).put(str != null ? str : this.f.getString("path"), joe.this.f(this.f));
            a();
            iih iihVar = iih.INSTANCE;
            iihVar.a(y1m.TAG_IMG, "uploadError path = " + str + " , errorCode = " + i + " , errMsg = " + str2 + " , errDetail = " + str3);
        }

        @Override // tb.t1e
        public void onExportProgress(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("817c24d2", new Object[]{this, str, new Integer(i)});
            }
        }

        @Override // tb.t1e
        public void onExportSucceed(String str, ozd ozdVar, qhv qhvVar) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e158a70", new Object[]{this, str, ozdVar, qhvVar});
                return;
            }
            String str3 = null;
            if (qhvVar != null) {
                str2 = qhvVar.b;
            } else {
                str2 = ozdVar != null ? ozdVar.a() : null;
            }
            JSONObject jSONObject = this.f;
            if (qhvVar != null) {
                str3 = qhvVar.f26765a;
            }
            jSONObject.put((JSONObject) "cdnFileId", str3);
            this.f.put((JSONObject) "url", str2);
            if (str == null) {
                str = this.f.getString("path");
            }
            ((HashMap) this.b.element).put(str, joe.this.f(this.f));
            a();
        }
    }

    static {
        t2o.a(126877706);
    }

    public /* synthetic */ joe(Uri uri, int i, Intent intent, int i2, a07 a07Var) {
        this(uri, i, (i2 & 4) != 0 ? null : intent);
    }

    public static final /* synthetic */ void b(joe joeVar, JSONArray jSONArray, boolean z, Integer num, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db68333f", new Object[]{joeVar, jSONArray, new Boolean(z), num, aVar});
        } else {
            joeVar.c(jSONArray, z, num, aVar);
        }
    }

    public static /* synthetic */ Object ipc$super(joe joeVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -857321247) {
            super.onActivityCreated((Activity) objArr[0], (Bundle) objArr[1]);
            return null;
        } else if (hashCode == 1257714799) {
            super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ability/impl/photo/ImageService");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b3 A[FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bc A[FINALLY_INSNS] */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
    @Override // tb.ua0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r5, int r6, android.content.Intent r7) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.joe.a(int, int, android.content.Intent):void");
    }

    public final void c(JSONArray jSONArray, boolean z, Integer num, a<JSONArray> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cf3324", new Object[]{this, jSONArray, new Boolean(z), num, aVar});
        } else if (jSONArray == null || jSONArray.isEmpty()) {
            aVar.a(jSONArray);
        } else if (!z) {
            MegaUtils.A(new b(aVar, jSONArray), 0L, 2, null);
        } else {
            MegaUtils.C(new c(jSONArray, num, aVar));
        }
    }

    public void d(Intent intent, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6ac0f7", new Object[]{this, intent, num});
        }
    }

    public void e(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f10adf", new Object[]{this, jSONArray});
        }
    }

    public void g(ErrorResult errorResult) {
        throw null;
    }

    @Override // tb.ua0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        ckf.g(activity, "activity");
        super.onActivityCreated(activity, bundle);
        if (this.b == null && this.d == null) {
            activity.finish();
            return;
        }
        this.f22111a = new WeakReference<>(activity);
        Intent intent = this.d;
        if (intent != null) {
            try {
                activity.startActivityForResult(intent, this.c);
            } catch (ActivityNotFoundException unused) {
                g(new ErrorResult("USER_CANCELED", "Unsupported Device", (Map) null, 4, (a07) null));
                activity.finish();
            }
        } else if (!Nav.from(activity).forResult(this.c).toUri(this.b)) {
            g(new ErrorResult("USER_CANCELED", "Unsupported Device", (Map) null, 4, (a07) null));
            activity.finish();
        }
    }

    public joe(Uri uri, int i, Intent intent) {
        this.b = uri;
        this.c = i;
        this.d = intent;
    }

    public final JSONObject f(JSONObject jSONObject) {
        String string;
        int i;
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("32ee43b7", new Object[]{this, jSONObject});
        }
        if (jSONObject == null || (string = jSONObject.getString("path")) == null) {
            return new JSONObject();
        }
        Integer integer = jSONObject.getInteger("size");
        Integer integer2 = jSONObject.getInteger("height");
        Integer integer3 = jSONObject.getInteger("width");
        String string2 = jSONObject.getString("url");
        String str = "video";
        boolean b2 = ckf.b(jSONObject.getBoolean(str), Boolean.TRUE);
        if (!b2) {
            str = "image";
        }
        String string3 = b2 ? jSONObject.getString("coverPath") : string;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (integer2 == null || integer3 == null) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(string, options);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) gl4.CONFIG_LOCAL_PATH, string);
        if (integer != null) {
            i = integer.intValue();
        } else {
            i = woe.INSTANCE.d(string);
        }
        jSONObject2.put((JSONObject) "size", (String) Integer.valueOf(i));
        if (integer2 != null) {
            i2 = integer2.intValue();
        } else {
            i2 = options.outHeight;
        }
        jSONObject2.put((JSONObject) "height", (String) Integer.valueOf(i2));
        if (integer3 != null) {
            i3 = integer3.intValue();
        } else {
            i3 = options.outWidth;
        }
        jSONObject2.put((JSONObject) "width", (String) Integer.valueOf(i3));
        jSONObject2.put((JSONObject) "mediaType", str);
        jSONObject2.put((JSONObject) "thumbPath", string3);
        jSONObject2.put((JSONObject) "cdnUrl", string2);
        jSONObject2.put((JSONObject) "thumbBase64", (String) null);
        jSONObject2.put((JSONObject) "cdnFileId", jSONObject.getString("cdnFileId"));
        return jSONObject2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.util.HashMap] */
    public final void i(Context context, JSONArray jSONArray, boolean z, String str, String str2, int i, int i2, s6u s6uVar, a<JSONArray> aVar) {
        int i3 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60b74ba", new Object[]{this, context, jSONArray, new Boolean(z), str, str2, new Integer(i), new Integer(i2), s6uVar, aVar});
        } else if (jSONArray == null || jSONArray.isEmpty() || s6uVar == null) {
            aVar.a(new JSONArray());
        } else {
            Iterator<Object> it = jSONArray.iterator();
            ckf.f(it, "data.iterator()");
            JSONArray jSONArray2 = new JSONArray();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new HashMap();
            while (it.hasNext()) {
                Object next = it.next();
                String str3 = null;
                if (!(next instanceof JSONObject)) {
                    next = null;
                }
                JSONObject jSONObject = (JSONObject) next;
                if (jSONObject != null) {
                    str3 = jSONObject.getString("path");
                }
                if (str3 == null) {
                    jSONArray.remove(jSONObject);
                } else if (!z) {
                    jSONArray2.add(f(jSONObject));
                } else {
                    Boolean bool = jSONObject.getBoolean("video");
                    boolean booleanValue = bool != null ? bool.booleanValue() : false;
                    if (!jSONObject.containsKey("video") && jSONObject.containsKey("mediaType")) {
                        booleanValue = jSONObject.getIntValue("mediaType") == i3;
                    }
                    e eVar = new e(ref$ObjectRef, jSONArray, jSONArray2, aVar, jSONObject);
                    if (booleanValue) {
                        s6uVar.c(context, jSONObject.getString(SimpleProfile.KEY_DISPLAYNAME), jSONObject.getString("coverPath"), jSONObject.getString("path"), i2, str, str2, "", eVar);
                    } else {
                        s6uVar.a(context, jSONObject.getString("path"), i, str, eVar);
                    }
                    jSONArray2 = jSONArray2;
                    ref$ObjectRef = ref$ObjectRef;
                    it = it;
                    i3 = 2;
                }
            }
            if (!z) {
                aVar.a(jSONArray2);
            }
            if (jSONArray.isEmpty()) {
                aVar.a(new JSONArray());
            }
        }
    }

    public final void h(Context context, JSONArray jSONArray, boolean z, boolean z2, String str, String str2, int i, int i2, s6u s6uVar, a<JSONArray> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e56e28e", new Object[]{this, context, jSONArray, new Boolean(z), new Boolean(z2), str, str2, new Integer(i), new Integer(i2), s6uVar, aVar});
            return;
        }
        ckf.g(context, "ctx");
        ckf.g(str, "imgUploadBizCode");
        ckf.g(str2, "videoUploadBizCode");
        ckf.g(aVar, "callBack");
        i(context, jSONArray, z, str, str2, i, i2, s6uVar, new d(z2, i, aVar));
    }
}
