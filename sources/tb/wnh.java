package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.airbnb.lottie.LottieDrawable;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wnh implements oie {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f30793a;
    public final JSONArray b;
    public final LottieDrawable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ olh c;
        public final /* synthetic */ Ref$ObjectRef d;

        public a(Ref$ObjectRef ref$ObjectRef, olh olhVar, Ref$ObjectRef ref$ObjectRef2) {
            this.b = ref$ObjectRef;
            this.c = olhVar;
            this.d = ref$ObjectRef2;
        }

        /* JADX WARN: Type inference failed for: r7v5, types: [T, android.graphics.Bitmap] */
        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            try {
                Ref$ObjectRef ref$ObjectRef = this.b;
                wnh wnhVar = wnh.this;
                ckf.f(succPhenixEvent, AdvanceSetting.NETWORK_TYPE);
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                ckf.f(drawable, "it.drawable");
                ref$ObjectRef.element = wnhVar.d(drawable.getBitmap(), this.c.e(), this.c.c());
            } catch (Throwable th) {
                String c = wnh.this.c();
                String c2 = wnh.this.c();
                TLog.loge(c, c2, "resize image (" + ((JSONObject) this.d.element).getString("source") + ") failed. " + th);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b<T extends b1m> implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;

        public b(Ref$ObjectRef ref$ObjectRef) {
            this.b = ref$ObjectRef;
        }

        /* renamed from: a */
        public final boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            String c = wnh.this.c();
            String c2 = wnh.this.c();
            TLog.loge(c, c2, "load url (" + ((JSONObject) this.b.element).getString("source") + ") failed.");
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements j1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ olh c;

        public c(Ref$ObjectRef ref$ObjectRef, olh olhVar) {
            this.b = ref$ObjectRef;
            this.c = olhVar;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [T, android.graphics.Bitmap] */
        @Override // tb.j1c
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
            } else if (view != null) {
                try {
                    this.b.element = wnh.this.a(view, this.c);
                } catch (Throwable th) {
                    String c = wnh.this.c();
                    String c2 = wnh.this.c();
                    TLog.loge(c, c2, "Unable to decode view to bitmap. " + th);
                }
            }
        }

        @Override // tb.j1c
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            String c = wnh.this.c();
            String c2 = wnh.this.c();
            TLog.loge(c, c2, "create dx view error. " + str);
        }
    }

    public wnh(Context context, JSONArray jSONArray, LottieDrawable lottieDrawable) {
        ckf.g(context, "context");
        ckf.g(jSONArray, "replacementImages");
        this.f30793a = context;
        this.b = jSONArray;
        this.c = lottieDrawable;
    }

    public final JSONObject b(JSONArray jSONArray, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("4e0ab383", new Object[]{this, jSONArray, str});
        }
        if (!(str == null || str.length() == 0)) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!(next instanceof JSONObject)) {
                    obj = null;
                } else {
                    obj = next;
                }
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject != null && jSONObject.containsKey(str)) {
                    return (JSONObject) next;
                }
            }
        }
        return null;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dbb2915", new Object[]{this});
        }
        return "MAImageDelegate";
    }

    public Bitmap d(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("59482910", new Object[]{this, bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public Bitmap a(View view, olh olhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a106995b", new Object[]{this, view, olhVar});
        }
        ckf.g(view, "view");
        ckf.g(olhVar, "asset");
        view.measure(View.MeasureSpec.makeMeasureSpec(pb6.s(this.f30793a), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(pb6.r(this.f30793a), Integer.MIN_VALUE));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return d(createBitmap, olhVar.e(), olhVar.c());
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, com.alibaba.fastjson.JSONObject] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.oie
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap fetchBitmap(tb.olh r22) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wnh.fetchBitmap(tb.olh):android.graphics.Bitmap");
    }
}
