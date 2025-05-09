package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ParcelUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String INNER_BUNDLE_KEY = "a";

    private ParcelUtils() {
    }

    public static <T extends VersionedParcelable> T fromInputStream(InputStream inputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((VersionedParcelable) ipChange.ipc$dispatch("acd58c5a", new Object[]{inputStream}));
        }
        return (T) new VersionedParcelStream(inputStream, null).readVersionedParcelable();
    }

    public static <T extends VersionedParcelable> T fromParcelable(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((VersionedParcelable) ipChange.ipc$dispatch("732a27", new Object[]{parcelable}));
        }
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).getVersionedParcel();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static <T extends VersionedParcelable> T getVersionedParcelable(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((VersionedParcelable) ipChange.ipc$dispatch("dc4a7c53", new Object[]{bundle, str}));
        }
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
            return (T) fromParcelable(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static <T extends VersionedParcelable> List<T> getVersionedParcelableList(Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6b4aa132", new Object[]{bundle, str});
        }
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(ParcelUtils.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList("a").iterator();
            while (it.hasNext()) {
                arrayList.add(fromParcelable((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void putVersionedParcelable(Bundle bundle, String str, VersionedParcelable versionedParcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f0b5bbc", new Object[]{bundle, str, versionedParcelable});
        } else if (versionedParcelable != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", toParcelable(versionedParcelable));
            bundle.putParcelable(str, bundle2);
        }
    }

    public static void putVersionedParcelableList(Bundle bundle, String str, List<? extends VersionedParcelable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a734e51f", new Object[]{bundle, str, list});
            return;
        }
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (VersionedParcelable versionedParcelable : list) {
            arrayList.add(toParcelable(versionedParcelable));
        }
        bundle2.putParcelableArrayList("a", arrayList);
        bundle.putParcelable(str, bundle2);
    }

    public static void toOutputStream(VersionedParcelable versionedParcelable, OutputStream outputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7235085", new Object[]{versionedParcelable, outputStream});
            return;
        }
        VersionedParcelStream versionedParcelStream = new VersionedParcelStream(null, outputStream);
        versionedParcelStream.writeVersionedParcelable(versionedParcelable);
        versionedParcelStream.closeField();
    }

    public static Parcelable toParcelable(VersionedParcelable versionedParcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("aeabe658", new Object[]{versionedParcelable});
        }
        return new ParcelImpl(versionedParcelable);
    }
}
