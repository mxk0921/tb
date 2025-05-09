package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dfp extends k30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f17776a = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f17777a;
        public Bitmap b;

        static {
            t2o.a(491782367);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9ebd1f3b", new Object[]{aVar});
            }
            return aVar.f17777a;
        }

        public static /* synthetic */ String b(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2ed79caf", new Object[]{aVar, str});
            }
            aVar.f17777a = str;
            return str;
        }

        public static /* synthetic */ Bitmap c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("ee7f03a4", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ Bitmap d(a aVar, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("a3851b44", new Object[]{aVar, bitmap});
            }
            aVar.b = bitmap;
            return bitmap;
        }

        public static /* synthetic */ void e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29f40d87", new Object[]{aVar});
            } else {
                aVar.f();
            }
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
                return;
            }
            this.f17777a = null;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                bitmap.recycle();
                this.b = null;
            }
        }
    }

    static {
        t2o.a(491782366);
    }

    public static /* synthetic */ Object ipc$super(dfp dfpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/iconbackanimeservice/impl/SetBitmapJsFeature");
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
        }
        return "iconBackAnime.setBitmap";
    }

    @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a
    public void b(JSONObject jSONObject, IJsBridgeService.a.AbstractC0565a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22f743e3", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null) {
            aVar.error("jsParams is empty");
            fve.e("SetBitmapJsFeature", "jsParams is empty");
        } else {
            try {
                String string = jSONObject.getString("bitmapSession");
                Bitmap bitmap = (Bitmap) jSONObject.getObject("bitmapValue", Bitmap.class);
                if (TextUtils.isEmpty(string) || bitmap == null) {
                    aVar.error("data is wrong");
                    fve.e("SetBitmapJsFeature", "setBitmap data is empty");
                } else {
                    a.b(this.f17776a, string);
                    a.d(this.f17776a, bitmap);
                    aVar.a(null);
                }
            } catch (Throwable th) {
                aVar.error("set BitMap failed" + th.toString());
                fve.e("SetBitmapJsFeature", "set BitMap failed" + th.toString());
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4a42606", new Object[]{this, str});
        } else if (TextUtils.equals(str, a.a(this.f17776a))) {
            a.e(this.f17776a);
        }
    }

    public Bitmap e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a0d060c", new Object[]{this, str});
        }
        if (TextUtils.equals(str, a.a(this.f17776a))) {
            return a.c(this.f17776a);
        }
        return null;
    }
}
