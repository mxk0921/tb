package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.uikit.media.expression.Expression;
import com.taobao.message.uikit.media.expression.ExpressionTable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class hc8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX = "/:";
    public static final String SINGLE_EMOTICON_PATTERN = "^\\[[a-zA-Z0-9\\u4e00-\\u9fa5]+\\-[a-zA-Z0-9\\u4e00-\\u9fa5]+\\]$";

    /* renamed from: a  reason: collision with root package name */
    public static Context f20536a;
    public static final Pattern b = Pattern.compile("\\[[a-zA-Z0-9\\u4e00-\\u9fa5]+\\-[a-zA-Z0-9\\u4e00-\\u9fa5]+\\]");
    public static final LruCache<String, Integer> c = new LruCache<>(100);
    public static SparseArray<Expression> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20537a;
        public int b;

        static {
            t2o.a(503317230);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "Result{emoticonCount=" + this.b + ", fragmentary='" + this.f20537a + "'}";
        }
    }

    static {
        t2o.a(503317229);
    }

    public static a a(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6c045657", new Object[]{str});
        }
        a aVar = new a();
        Matcher matcher = b.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (matcher.find()) {
            i2++;
            sb.append(str.substring(i, matcher.start()));
            i = matcher.end();
        }
        sb.append(str.substring(i, str.length()));
        aVar.f20537a = sb.toString();
        aVar.b = i2;
        return aVar;
    }

    public static a b(String str) {
        String str2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3b49694", new Object[]{str});
        }
        a aVar = new a();
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        String[] split = str.split(PREFIX);
        StringBuilder sb = new StringBuilder();
        if (!(split == null || split.length == 0)) {
            int i2 = 0;
            while (i < split.length) {
                String str3 = split[i];
                int c2 = c(str3);
                if (c2 != -1) {
                    i2++;
                    sb.append(str3.substring(d().get(c2).value.length() - 2));
                } else {
                    if (i == 0) {
                        str2 = "";
                    } else {
                        str2 = PREFIX;
                    }
                    sb.append(str2);
                    sb.append(str3);
                }
                i++;
            }
            i = i2;
        }
        aVar.b = i;
        aVar.f20537a = sb.toString();
        return aVar;
    }

    public static int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a74ed244", new Object[]{str})).intValue();
        }
        if (str == null) {
            return -1;
        }
        LruCache<String, Integer> lruCache = c;
        Integer num = lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (str.contains("O=O")) {
            lruCache.put(str, 72);
            return 72;
        }
        String r0 = nwv.r0(str);
        for (int i = 0; i < d().size(); i++) {
            if ((PREFIX + r0).contains(d().get(i).value)) {
                c.put(r0, Integer.valueOf(i));
                return i;
            }
        }
        return -1;
    }

    public static SparseArray<Expression> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("13a52da4", new Object[0]);
        }
        if (d == null) {
            d = ExpressionTable.getExpressionMap(new String[]{"im", "guang"});
        }
        return d;
    }

    public static CharSequence e(Context context, String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("63a0535d", new Object[]{context, str, new Integer(i), new Boolean(z)});
        }
        String[] split = str.split(PREFIX);
        if (split != null && split.length > 1) {
            if (i == 0) {
                i = 18;
            }
            return ExpressionTable.getExpressionString(context, str, true, s6o.H(context, s6o.S(context, i)));
        } else if (z) {
            return new SpannableString(str);
        } else {
            return str;
        }
    }

    public static String f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8fda383", new Object[]{new Integer(i), new Integer(i2)});
        }
        int i3 = d().get(i).localResInt;
        return "<img src=\"./res_id_" + i3 + ".png\" style=\"width:" + i2 + ";height:" + i2 + "\"/>";
    }

    public static int g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a78c8b60", new Object[]{str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        a b2 = b(str);
        a a2 = a(b2.f20537a);
        return b2.b + a2.b + a2.f20537a.length();
    }

    public static void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else {
            f20536a = context.getApplicationContext();
        }
    }

    public static boolean i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46f16465", new Object[]{str})).booleanValue();
        }
        for (int i = 0; i < d().size(); i++) {
            if (d().get(i).value.contains(str)) {
                return true;
            }
        }
        if (str.matches(SINGLE_EMOTICON_PATTERN)) {
            return true;
        }
        return false;
    }

    public static CharSequence j(Context context, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("130a5876", new Object[]{context, str, new Integer(i)});
        }
        return e(context, str, i, false);
    }

    public static String k(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5ad8f5", new Object[]{str, new Integer(i)});
        }
        String[] split = str.split(PREFIX);
        if (split == null || split.length <= 1) {
            return str;
        }
        if (i == 0) {
            i = 18;
        }
        int S = s6o.S(f20536a, i);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < split.length; i2++) {
            if (!TextUtils.isEmpty(split[i2])) {
                int c2 = c(split[i2]);
                if (c2 != -1) {
                    str2 = f(c2, S);
                } else {
                    str2 = null;
                }
                if (i2 == 0 && !str.startsWith(PREFIX)) {
                    sb.append(split[i2]);
                } else if (str2 == null) {
                    sb.append(PREFIX + split[i2]);
                } else {
                    String d2 = nwv.d(d().get(c2).value);
                    sb.append(str2);
                    sb.append(split[i2].substring(d2.length() - 2));
                }
            }
        }
        return sb.toString();
    }
}
