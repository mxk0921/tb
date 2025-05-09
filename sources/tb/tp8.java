package tb;

import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tp8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int INITIAL = 0;
    public static final int SEEN = 1;
    public static final int UNSEEN = 2;
    public String block;
    public String tag;
    public View view;
    public Map<String, Object> viewData;
    public long beginTime = 0;
    public long endTime = 0;
    public long lastCalTime = 0;
    public int lastState = 0;
    public double area = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(962593282);
    }

    public tp8(View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof tp8)) {
            return TextUtils.equals(this.tag, ((tp8) obj).tag);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.tag.hashCode();
    }

    public String toString() {
        CharSequence charSequence;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder c = iqq.a().c();
        c.append(this.view.getClass().getSimpleName());
        c.append(":");
        c.append(this.tag);
        c.append(":");
        if (TextUtils.isEmpty(this.view.getContentDescription())) {
            charSequence = "";
        } else {
            charSequence = this.view.getContentDescription();
        }
        c.append(charSequence);
        c.append(":");
        c.append(a(this.lastState));
        String sb = c.toString();
        iqq.a().b(c);
        return sb;
    }

    public final String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ca49d5f", new Object[]{this, new Integer(i)});
        }
        if (i == 1) {
            return "可见";
        }
        if (i == 2) {
            return "不可见";
        }
        return "初始值";
    }

    public boolean isSatisfyTimeRequired() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc882e10", new Object[]{this})).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.beginTime;
        un8.d(null, "tag", this.tag, "duration", Long.valueOf(currentTimeMillis));
        return currentTimeMillis > ((long) op8.timeThreshold) && currentTimeMillis < ((long) op8.maxTimeThreshold);
    }
}
