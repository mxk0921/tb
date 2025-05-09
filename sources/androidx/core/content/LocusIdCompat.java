package androidx.core.content;

import android.content.LocusId;
import android.os.Build;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocusIdCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String mId;
    private final LocusId mWrapped;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static LocusId create(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocusId) ipChange.ipc$dispatch("7db985db", new Object[]{str});
            }
            return new LocusId(str);
        }

        public static String getId(LocusId locusId) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca9f5fda", new Object[]{locusId});
            }
            return locusId.getId();
        }
    }

    public LocusIdCompat(String str) {
        this.mId = (String) Preconditions.checkStringNotEmpty(str, "id cannot be empty");
        if (Build.VERSION.SDK_INT >= 29) {
            this.mWrapped = Api29Impl.create(str);
        } else {
            this.mWrapped = null;
        }
    }

    private String getSanitizedId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a2d9099", new Object[]{this});
        }
        int length = this.mId.length();
        return length + "_chars";
    }

    public static LocusIdCompat toLocusIdCompat(LocusId locusId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocusIdCompat) ipChange.ipc$dispatch("db62058d", new Object[]{locusId});
        }
        Preconditions.checkNotNull(locusId, "locusId cannot be null");
        return new LocusIdCompat((String) Preconditions.checkStringNotEmpty(Api29Impl.getId(locusId), "id cannot be empty"));
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || LocusIdCompat.class != obj.getClass()) {
            return false;
        }
        LocusIdCompat locusIdCompat = (LocusIdCompat) obj;
        String str = this.mId;
        if (str != null) {
            return str.equals(locusIdCompat.mId);
        }
        if (locusIdCompat.mId == null) {
            return true;
        }
        return false;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.mId;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.mId;
        if (str != null) {
            i = str.hashCode();
        }
        return 31 + i;
    }

    public LocusId toLocusId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return vch.a(ipChange.ipc$dispatch("5c9ad173", new Object[]{this}));
        }
        return this.mWrapped;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LocusIdCompat[" + getSanitizedId() + "]";
    }
}
