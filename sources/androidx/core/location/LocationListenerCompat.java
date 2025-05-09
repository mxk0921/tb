package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface LocationListenerCompat extends LocationListener {
    void onFlushComplete(int i);

    void onLocationChanged(List<Location> list);

    @Override // android.location.LocationListener
    void onProviderDisabled(String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(String str);

    @Override // android.location.LocationListener
    void onStatusChanged(String str, int i, Bundle bundle);
}
