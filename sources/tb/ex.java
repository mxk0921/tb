package tb;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ex {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(620757090);
    }

    public ex error(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ex) ipChange.ipc$dispatch("a35e70cf", new Object[]{this, new Integer(i)}) : this;
    }

    public abstract p1m fetch();

    public abstract p1m into(ImageView imageView);

    public ex onlyCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ex) ipChange.ipc$dispatch("ae5ce638", new Object[]{this});
        }
        return this;
    }

    public ex placeholder(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ex) ipChange.ipc$dispatch("5759cf44", new Object[]{this, new Integer(i)}) : this;
    }

    public String url() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae8274ea", new Object[]{this});
        }
        return "";
    }

    public ex error(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ex) ipChange.ipc$dispatch("c89f8dae", new Object[]{this, drawable}) : this;
    }

    public ex placeholder(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ex) ipChange.ipc$dispatch("d25c3319", new Object[]{this, drawable}) : this;
    }
}
