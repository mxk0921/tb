package tb;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class unv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29521a;

    static {
        t2o.a(961544386);
    }

    public unv(String str) {
        this.f29521a = Uri.parse(str);
    }

    public static unv c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unv) ipChange.ipc$dispatch("56cff92", new Object[]{str});
        }
        return new unv(str);
    }

    public Set<String> b() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("48f80ec7", new Object[]{this});
        }
        if (!this.f29521a.isOpaque()) {
            String encodedQuery = this.f29521a.getEncodedQuery();
            if (encodedQuery == null) {
                return Collections.emptySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(encodedQuery.substring(i, indexOf2));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            return Collections.unmodifiableSet(linkedHashSet);
        }
        throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28d85598", new Object[]{this, str});
        }
        if (this.f29521a.isOpaque()) {
            throw new UnsupportedOperationException("This isn't a hierarchical URI.");
        } else if (str != null) {
            String encodedQuery = this.f29521a.getEncodedQuery();
            if (encodedQuery == null) {
                return null;
            }
            int length = encodedQuery.length();
            int i = 0;
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                if (indexOf2 - i != str.length() || !encodedQuery.regionMatches(i, str, 0, str.length())) {
                    if (indexOf == -1) {
                        return null;
                    }
                    i = indexOf + 1;
                } else if (indexOf2 == i2) {
                    return "";
                } else {
                    return encodedQuery.substring(indexOf2 + 1, i2);
                }
            }
        } else {
            throw new NullPointerException("key");
        }
    }
}
