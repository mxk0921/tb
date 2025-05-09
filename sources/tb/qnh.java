package tb;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.text.TextLayoutBuilder;
import com.taobao.tao.Globals;
import com.taobao.weex.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qnh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f26837a;
    public final JSONObject b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends Drawable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f26838a;

        public a(int i) {
            this.f26838a = i;
            setBounds(0, 0, i, 1);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/M3TitleHelper$report$placeHolderDrawable$1");
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public int getIntrinsicWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
            }
            return this.f26838a;
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
            }
        }
    }

    static {
        t2o.a(815792604);
    }

    public qnh(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f26837a = jSONObject;
        this.b = jSONObject2;
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("350e07db", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            ckf.d(str);
            return str;
        }
        throw new RuntimeException("invalid value");
    }

    public final Layout b(float f, CharSequence charSequence, float f2, boolean z, boolean z2) {
        Typeface typeface;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Layout) ipChange.ipc$dispatch("ba195d1b", new Object[]{this, new Float(f), charSequence, new Float(f2), new Boolean(z), new Boolean(z2)});
        }
        TextLayoutBuilder textLayoutBuilder = new TextLayoutBuilder();
        textLayoutBuilder.r(false);
        if (z2) {
            i = 1;
        }
        textLayoutBuilder.e(Globals.getApplication().getResources().getDisplayMetrics().density).f(null).m(100).q(0.0f, 0.0f, 0.0f, 0).s(false).t(charSequence).x((int) f2).C((int) f, i).h(true).y(0.0f).z(1.0f).c(Layout.Alignment.ALIGN_NORMAL).k(0).d(0).g(0);
        if (Build.VERSION.SDK_INT >= 26) {
            textLayoutBuilder.i(0);
        }
        if (z) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textLayoutBuilder.B(typeface);
        return textLayoutBuilder.a();
    }

    public final void d() {
        Object value;
        Object value2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.f26837a;
        if (jSONObject != null && this.b != null) {
            try {
                String a2 = a(jSONObject.getString("fontSize"));
                boolean booleanValue = this.f26837a.getBooleanValue("isBold");
                CharSequence c = c(a(this.f26837a.getString("title")));
                String a3 = a(this.f26837a.getString("width"));
                String string = this.f26837a.getString("iconWidth");
                int e = TextUtils.isEmpty(string) ? 0 : (int) fxh.e(string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ImageSpan(new a(e)), 0, 1, 33);
                spannableStringBuilder.append(c);
                int intValue = this.f26837a.getIntValue(Constants.Name.LINES);
                Layout b = b(fxh.e(a3), spannableStringBuilder, fxh.e(a2), booleanValue, true);
                Layout b2 = b(2.14748365E9f, spannableStringBuilder, fxh.e(a2), booleanValue, false);
                HashMap hashMap = new HashMap();
                hashMap.put(Constants.Name.LINES, String.valueOf(intValue));
                hashMap.put("actualLines", String.valueOf(b != null ? Integer.valueOf(b.getLineCount()) : null));
                StringBuilder sb = new StringBuilder();
                if (b2 != null) {
                    i = b2.getWidth();
                }
                sb.append(o1p.e(i));
                sb.append("px");
                hashMap.put("totalWidth", sb.toString());
                for (Map.Entry<String, Object> entry : this.b.entrySet()) {
                    ckf.f(entry, "next(...)");
                    Map.Entry<String, Object> entry2 = entry;
                    String key = entry2.getKey();
                    if (!(key == null || (value2 = entry2.getValue()) == null)) {
                        hashMap.put(key, value2.toString());
                    }
                }
                for (Map.Entry<String, Object> entry3 : this.f26837a.entrySet()) {
                    ckf.f(entry3, "next(...)");
                    Map.Entry<String, Object> entry4 = entry3;
                    String key2 = entry4.getKey();
                    if (!(key2 == null || (value = entry4.getValue()) == null)) {
                        hashMap.put(key2, value.toString());
                    }
                }
                sen.l("SearchItemTitleExpose", hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public final CharSequence c(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("bcce7b59", new Object[]{this, charSequence});
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * 2);
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (ckf.i(charAt, 55296) < 0 || ckf.i(charAt, 56320) >= 0) {
                sb.append(charAt);
                sb.append("\u200b");
            } else {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        ckf.f(sb2, "toString(...)");
        return sb2;
    }
}
