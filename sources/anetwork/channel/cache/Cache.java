package anetwork.channel.cache;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface Cache {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class Entry implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public byte[] data;
        public String etag;
        public long lastModified;
        public Map<String, List<String>> responseHeaders = Collections.EMPTY_MAP;
        public long serverDate;
        public long ttl;

        static {
            t2o.a(607126023);
        }

        public boolean isFresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("44a938af", new Object[]{this})).booleanValue();
            }
            if (System.currentTimeMillis() <= this.ttl) {
                return true;
            }
            return false;
        }
    }

    void clear();

    Entry get(String str);

    void put(String str, Entry entry);

    void remove(String str);
}
