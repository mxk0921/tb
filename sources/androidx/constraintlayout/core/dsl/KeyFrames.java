package androidx.constraintlayout.core.dsl;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class KeyFrames {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keys) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601c88e5", new Object[]{this, keys});
        } else {
            this.mKeys.add(keys);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            sb.append("keyFrames:{\n");
            Iterator<Keys> it = this.mKeys.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        return sb.toString();
    }
}
