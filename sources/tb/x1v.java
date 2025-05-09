package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final x1v c = new x1v();

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f31081a = new Vector();
    public final int b = 1000;

    static {
        t2o.a(962593302);
    }

    public static x1v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x1v) ipChange.ipc$dispatch("3e3a2496", new Object[0]);
        }
        return c;
    }

    public void addAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad69cd88", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (((Vector) this.f31081a).size() >= this.b) {
                ((Vector) this.f31081a).remove(0);
            }
            ((Vector) this.f31081a).add(str);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        List<String> list = this.f31081a;
        if (list != null) {
            ((Vector) list).clear();
        }
    }

    public String getOperationHistory(int i, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e5198dd", new Object[]{this, new Integer(i), str});
        }
        StringBuffer stringBuffer = new StringBuffer(500);
        if (TextUtils.isEmpty(str)) {
            str = ",";
        }
        if (i <= 0) {
            return null;
        }
        if (i >= ((Vector) this.f31081a).size()) {
            Iterator it = ((Vector) this.f31081a).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!z) {
                    stringBuffer.append(str);
                }
                stringBuffer.append(str2);
                z = false;
            }
        } else {
            int size = (((Vector) this.f31081a).size() - i) - 1;
            int i2 = size;
            boolean z2 = true;
            while (size < ((Vector) this.f31081a).size()) {
                String str3 = (String) ((Vector) this.f31081a).get(i2);
                if (!TextUtils.isEmpty(str3)) {
                    if (!z2) {
                        stringBuffer.append(str);
                    }
                    stringBuffer.append(str3);
                    z2 = false;
                }
                i2++;
            }
        }
        return stringBuffer.toString();
    }
}
