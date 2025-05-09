package androidx.core.location;

import android.location.GnssMeasurementsEvent;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.collection.SimpleArrayMap;
import androidx.core.location.GnssStatusCompat;
import androidx.core.location.LocationManagerCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Consumer;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.CartRecommendRefreshScene;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import tb.hbh;
import tb.ibh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class LocationManagerCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static Field sContextField;
    private static Method sGnssRequestBuilderBuildMethod;
    private static Class<?> sGnssRequestBuilderClass;
    public static final WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> sLocationListeners = new WeakHashMap<>();
    private static Method sRegisterGnssMeasurementsCallbackMethod;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6181140", new Object[]{locationManager, callback})).booleanValue() : locationManager.registerGnssMeasurementsCallback(callback);
        }

        public static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fdea1283", new Object[]{locationManager, callback});
            } else {
                locationManager.unregisterGnssMeasurementsCallback(callback);
            }
        }

        public static void unregisterGnssStatusCallback(LocationManager locationManager, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bb388e", new Object[]{locationManager, obj});
                return;
            }
            if (obj instanceof PreRGnssStatusTransport) {
                ((PreRGnssStatusTransport) obj).unregister();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }

        public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7f018a70", new Object[]{locationManager, callback, handler})).booleanValue() : locationManager.registerGnssMeasurementsCallback(callback, handler);
        }

        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0516ea2", new Object[]{locationManager, handler, executor, callback})).booleanValue();
            }
            Preconditions.checkArgument(handler != null);
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    PreRGnssStatusTransport preRGnssStatusTransport = (PreRGnssStatusTransport) simpleArrayMap.get(callback);
                    if (preRGnssStatusTransport == null) {
                        preRGnssStatusTransport = new PreRGnssStatusTransport(callback);
                    } else {
                        preRGnssStatusTransport.unregister();
                    }
                    preRGnssStatusTransport.register(executor);
                    if (!locationManager.registerGnssStatusCallback(preRGnssStatusTransport, handler)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, preRGnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static String getGnssHardwareModelName(LocationManager locationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6d153359", new Object[]{locationManager});
            }
            return locationManager.getGnssHardwareModelName();
        }

        public static int getGnssYearOfHardware(LocationManager locationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("35027d24", new Object[]{locationManager})).intValue();
            }
            return locationManager.getGnssYearOfHardware();
        }

        public static boolean isLocationEnabled(LocationManager locationManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b7d3555e", new Object[]{locationManager})).booleanValue();
            }
            return locationManager.isLocationEnabled();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static boolean hasProvider(LocationManager locationManager, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("39fd4111", new Object[]{locationManager, str})).booleanValue();
            }
            return locationManager.hasProvider(str);
        }

        public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fa46ef66", new Object[]{locationManager, executor, callback})).booleanValue();
            }
            return locationManager.registerGnssMeasurementsCallback(executor, callback);
        }

        public static void requestLocationUpdates(LocationManager locationManager, String str, LocationRequest locationRequest, Executor executor, LocationListener locationListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c58802bf", new Object[]{locationManager, str, locationRequest, executor, locationListener});
            } else {
                locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CancellableLocationListener implements LocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Consumer<Location> mConsumer;
        private final Executor mExecutor;
        private final LocationManager mLocationManager;
        private final Handler mTimeoutHandler = new Handler(Looper.getMainLooper());
        public Runnable mTimeoutRunnable;
        private boolean mTriggered;

        public CancellableLocationListener(LocationManager locationManager, Executor executor, Consumer<Location> consumer) {
            this.mLocationManager = locationManager;
            this.mExecutor = executor;
            this.mConsumer = consumer;
        }

        private void cleanup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("792e92b", new Object[]{this});
                return;
            }
            this.mConsumer = null;
            this.mLocationManager.removeUpdates(this);
            Runnable runnable = this.mTimeoutRunnable;
            if (runnable != null) {
                this.mTimeoutHandler.removeCallbacks(runnable);
                this.mTimeoutRunnable = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onLocationChanged$1(Consumer consumer, Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edc80e41", new Object[]{consumer, location});
            } else {
                consumer.accept(location);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$startTimeout$0() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf8fae6f", new Object[]{this});
                return;
            }
            this.mTimeoutRunnable = null;
            onLocationChanged(null);
        }

        public void cancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("707fe601", new Object[]{this});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.mTriggered) {
                        this.mTriggered = true;
                        cleanup();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.mTriggered) {
                        this.mTriggered = true;
                        final Consumer<Location> consumer = this.mConsumer;
                        this.mExecutor.execute(new Runnable() { // from class: tb.obh
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationManagerCompat.CancellableLocationListener.lambda$onLocationChanged$1(Consumer.this, location);
                            }
                        });
                        cleanup();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
            } else {
                onLocationChanged(null);
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
            }
        }

        public void startTimeout(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4172ffde", new Object[]{this, new Long(j)});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.mTriggered) {
                        Runnable nbhVar = new Runnable() { // from class: tb.nbh
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationManagerCompat.CancellableLocationListener.this.lambda$startTimeout$0();
                            }
                        };
                        this.mTimeoutRunnable = nbhVar;
                        this.mTimeoutHandler.postDelayed(nbhVar, j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GnssListenersHolder {
        public static final SimpleArrayMap<Object, Object> sGnssStatusListeners = new SimpleArrayMap<>();
        public static final SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> sGnssMeasurementListeners = new SimpleArrayMap<>();

        private GnssListenersHolder() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GnssMeasurementsTransport extends GnssMeasurementsEvent.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final GnssMeasurementsEvent.Callback mCallback;
        public volatile Executor mExecutor;

        public GnssMeasurementsTransport(GnssMeasurementsEvent.Callback callback, Executor executor) {
            this.mCallback = callback;
            this.mExecutor = executor;
        }

        public static /* synthetic */ Object ipc$super(GnssMeasurementsTransport gnssMeasurementsTransport, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/location/LocationManagerCompat$GnssMeasurementsTransport");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGnssMeasurementsReceived$0(Executor executor, GnssMeasurementsEvent gnssMeasurementsEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d802c15", new Object[]{this, executor, gnssMeasurementsEvent});
            } else if (this.mExecutor == executor) {
                this.mCallback.onGnssMeasurementsReceived(gnssMeasurementsEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStatusChanged$1(Executor executor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2583a5a7", new Object[]{this, executor, new Integer(i)});
            } else if (this.mExecutor == executor) {
                this.mCallback.onStatusChanged(i);
            }
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onGnssMeasurementsReceived(final GnssMeasurementsEvent gnssMeasurementsEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0cbfad2", new Object[]{this, gnssMeasurementsEvent});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.rbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GnssMeasurementsTransport.this.lambda$onGnssMeasurementsReceived$0(executor, gnssMeasurementsEvent);
                    }
                });
            }
        }

        @Override // android.location.GnssMeasurementsEvent.Callback
        public void onStatusChanged(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2e22679", new Object[]{this, new Integer(i)});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.sbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.GnssMeasurementsTransport.this.lambda$onStatusChanged$1(executor, i);
                    }
                });
            }
        }

        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.mExecutor = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GnssStatusTransport extends GnssStatus.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final GnssStatusCompat.Callback mCallback;

        public GnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public static /* synthetic */ Object ipc$super(GnssStatusTransport gnssStatusTransport, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/location/LocationManagerCompat$GnssStatusTransport");
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8659a398", new Object[]{this, new Integer(i)});
            } else {
                this.mCallback.onFirstFix(i);
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("131dc7e1", new Object[]{this, gnssStatus});
            } else {
                this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb092529", new Object[]{this});
            } else {
                this.mCallback.onStarted();
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436bf075", new Object[]{this});
            } else {
                this.mCallback.onStopped();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class GpsStatusTransport implements GpsStatus.Listener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final GnssStatusCompat.Callback mCallback;
        public volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        public GpsStatusTransport(LocationManager locationManager, GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mLocationManager = locationManager;
            this.mCallback = callback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$0(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3831834f", new Object[]{this, executor});
            } else if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$1(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac70bbae", new Object[]{this, executor});
            } else if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$2(Executor executor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f54f0096", new Object[]{this, executor, new Integer(i)});
            } else if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onGpsStatusChanged$3(Executor executor, GnssStatusCompat gnssStatusCompat) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b0d1f0a", new Object[]{this, executor, gnssStatusCompat});
            } else if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(gnssStatusCompat);
            }
        }

        @Override // android.location.GpsStatus.Listener
        public void onGpsStatusChanged(int i) {
            GpsStatus gpsStatus;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("263b9fe5", new Object[]{this, new Integer(i)});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                if (i == 1) {
                    executor.execute(new Runnable() { // from class: tb.tbh
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.GpsStatusTransport.this.lambda$onGpsStatusChanged$0(executor);
                        }
                    });
                } else if (i == 2) {
                    executor.execute(new Runnable() { // from class: tb.ubh
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.GpsStatusTransport.this.lambda$onGpsStatusChanged$1(executor);
                        }
                    });
                } else if (i == 3) {
                    GpsStatus gpsStatus2 = this.mLocationManager.getGpsStatus(null);
                    if (gpsStatus2 != null) {
                        final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                        executor.execute(new Runnable() { // from class: tb.vbh
                            @Override // java.lang.Runnable
                            public final void run() {
                                LocationManagerCompat.GpsStatusTransport.this.lambda$onGpsStatusChanged$2(executor, timeToFirstFix);
                            }
                        });
                    }
                } else if (i == 4 && (gpsStatus = this.mLocationManager.getGpsStatus(null)) != null) {
                    final GnssStatusCompat wrap = GnssStatusCompat.wrap(gpsStatus);
                    executor.execute(new Runnable() { // from class: tb.wbh
                        @Override // java.lang.Runnable
                        public final void run() {
                            LocationManagerCompat.GpsStatusTransport.this.lambda$onGpsStatusChanged$3(executor, wrap);
                        }
                    });
                }
            }
        }

        public void register(Executor executor) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55b8732c", new Object[]{this, executor});
                return;
            }
            if (this.mExecutor != null) {
                z = false;
            }
            Preconditions.checkState(z);
            this.mExecutor = executor;
        }

        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.mExecutor = null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class InlineHandlerExecutor implements Executor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Handler mHandler;

        public InlineHandlerExecutor(Handler handler) {
            this.mHandler = (Handler) Preconditions.checkNotNull(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
            } else if (Looper.myLooper() == this.mHandler.getLooper()) {
                runnable.run();
            } else if (!this.mHandler.post((Runnable) Preconditions.checkNotNull(runnable))) {
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LocationListenerKey {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final LocationListenerCompat mListener;
        public final String mProvider;

        public LocationListenerKey(String str, LocationListenerCompat locationListenerCompat) {
            this.mProvider = (String) ObjectsCompat.requireNonNull(str, "invalid null provider");
            this.mListener = (LocationListenerCompat) ObjectsCompat.requireNonNull(locationListenerCompat, "invalid null listener");
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof LocationListenerKey)) {
                return false;
            }
            LocationListenerKey locationListenerKey = (LocationListenerKey) obj;
            if (!this.mProvider.equals(locationListenerKey.mProvider) || !this.mListener.equals(locationListenerKey.mListener)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return ObjectsCompat.hash(this.mProvider, this.mListener);
        }
    }

    private LocationManagerCompat() {
    }

    @Deprecated
    public static void getCurrentLocation(LocationManager locationManager, String str, CancellationSignal cancellationSignal, Executor executor, Consumer<Location> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aaa672d", new Object[]{locationManager, str, cancellationSignal, executor, consumer});
        } else {
            getCurrentLocation(locationManager, str, cancellationSignal != null ? (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject() : null, executor, consumer);
        }
    }

    public static String getGnssHardwareModelName(LocationManager locationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d153359", new Object[]{locationManager});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssHardwareModelName(locationManager);
        }
        return null;
    }

    public static int getGnssYearOfHardware(LocationManager locationManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35027d24", new Object[]{locationManager})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.getGnssYearOfHardware(locationManager);
        }
        return 0;
    }

    public static boolean hasProvider(LocationManager locationManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39fd4111", new Object[]{locationManager, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.hasProvider(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            if (locationManager.getProvider(str) != null) {
                return true;
            }
            return false;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean isLocationEnabled(LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.isLocationEnabled(locationManager);
        }
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCurrentLocation$0(Consumer consumer, Location location) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12472292", new Object[]{consumer, location});
        } else {
            consumer.accept(location);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$registerGnssStatusCallback$1(LocationManager locationManager, GpsStatusTransport gpsStatusTransport) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("81b5e334", new Object[]{locationManager, gpsStatusTransport});
        }
        return Boolean.valueOf(locationManager.addGpsStatusListener(gpsStatusTransport));
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f018a70", new Object[]{locationManager, callback, handler})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler);
        }
        if (i == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, ExecutorCompat.create(handler), callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
        synchronized (simpleArrayMap) {
            try {
                unregisterGnssMeasurementsCallback(locationManager, callback);
                if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, callback, handler)) {
                    return false;
                }
                simpleArrayMap.put(callback, callback);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e6f76be", new Object[]{locationManager, callback, handler})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, ExecutorCompat.create(handler), callback);
        }
        return registerGnssStatusCallback(locationManager, new InlineHandlerExecutor(handler), callback);
    }

    public static void registerLocationListenerTransport(LocationManager locationManager, LocationListenerTransport locationListenerTransport) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d693f7e", new Object[]{locationManager, locationListenerTransport});
            return;
        }
        WeakReference<LocationListenerTransport> put = sLocationListeners.put(locationListenerTransport.getKey(), new WeakReference<>(locationListenerTransport));
        LocationListenerTransport locationListenerTransport2 = put != null ? put.get() : null;
        if (locationListenerTransport2 != null) {
            locationListenerTransport2.unregister();
            locationManager.removeUpdates(locationListenerTransport2);
        }
    }

    public static void removeUpdates(LocationManager locationManager, LocationListenerCompat locationListenerCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af977788", new Object[]{locationManager, locationListenerCompat});
            return;
        }
        WeakHashMap<LocationListenerKey, WeakReference<LocationListenerTransport>> weakHashMap = sLocationListeners;
        synchronized (weakHashMap) {
            try {
                ArrayList arrayList = null;
                for (WeakReference<LocationListenerTransport> weakReference : weakHashMap.values()) {
                    LocationListenerTransport locationListenerTransport = weakReference.get();
                    if (locationListenerTransport != null) {
                        LocationListenerKey key = locationListenerTransport.getKey();
                        if (key.mListener == locationListenerCompat) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(key);
                            locationListenerTransport.unregister();
                            locationManager.removeUpdates(locationListenerTransport);
                        }
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sLocationListeners.remove((LocationListenerKey) it.next());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        locationManager.removeUpdates(locationListenerCompat);
    }

    public static void requestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94ef7d7b", new Object[]{locationManager, str, locationRequestCompat, executor, locationListenerCompat});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), executor, locationListenerCompat);
        } else if (i < 30 || !Api30Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, executor, locationListenerCompat)) {
            LocationListenerTransport locationListenerTransport = new LocationListenerTransport(new LocationListenerKey(str, locationListenerCompat), executor);
            if (!Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerTransport)) {
                synchronized (sLocationListeners) {
                    locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerTransport, Looper.getMainLooper());
                    registerLocationListenerTransport(locationManager, locationListenerTransport);
                }
            }
        }
    }

    public static void unregisterGnssMeasurementsCallback(LocationManager locationManager, GnssMeasurementsEvent.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdea1283", new Object[]{locationManager, callback});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api24Impl.unregisterGnssMeasurementsCallback(locationManager, callback);
        } else {
            SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
            synchronized (simpleArrayMap) {
                try {
                    GnssMeasurementsEvent.Callback a2 = hbh.a(simpleArrayMap.remove(callback));
                    if (a2 != null) {
                        if (a2 instanceof GnssMeasurementsTransport) {
                            ((GnssMeasurementsTransport) a2).unregister();
                        }
                        Api24Impl.unregisterGnssMeasurementsCallback(locationManager, a2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void unregisterGnssStatusCallback(LocationManager locationManager, GnssStatusCompat.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5616bee3", new Object[]{locationManager, callback});
        } else if (Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    Object remove = simpleArrayMap.remove(callback);
                    if (remove != null) {
                        Api24Impl.unregisterGnssStatusCallback(locationManager, remove);
                    }
                } finally {
                }
            }
        } else {
            SimpleArrayMap<Object, Object> simpleArrayMap2 = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap2) {
                try {
                    GpsStatusTransport gpsStatusTransport = (GpsStatusTransport) simpleArrayMap2.remove(callback);
                    if (gpsStatusTransport != null) {
                        gpsStatusTransport.unregister();
                        locationManager.removeGpsStatusListener(gpsStatusTransport);
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
        }

        public static void getCurrentLocation(LocationManager locationManager, String str, android.os.CancellationSignal cancellationSignal, Executor executor, final Consumer<Location> consumer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12ebf443", new Object[]{locationManager, str, cancellationSignal, executor, consumer});
                return;
            }
            Objects.requireNonNull(consumer);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new java.util.function.Consumer() { // from class: tb.mbh
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Consumer.this.accept((Location) obj);
                }
            });
        }

        public static boolean registerGnssStatusCallback(LocationManager locationManager, Handler handler, Executor executor, GnssStatusCompat.Callback callback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d0516ea2", new Object[]{locationManager, handler, executor, callback})).booleanValue();
            }
            SimpleArrayMap<Object, Object> simpleArrayMap = GnssListenersHolder.sGnssStatusListeners;
            synchronized (simpleArrayMap) {
                try {
                    GnssStatusTransport gnssStatusTransport = (GnssStatusTransport) simpleArrayMap.get(callback);
                    if (gnssStatusTransport == null) {
                        gnssStatusTransport = new GnssStatusTransport(callback);
                    }
                    if (!locationManager.registerGnssStatusCallback(executor, gnssStatusTransport)) {
                        return false;
                    }
                    simpleArrayMap.put(callback, gnssStatusTransport);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, Executor executor, LocationListenerCompat locationListenerCompat) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (sLocationRequestClass == null) {
                        sLocationRequestClass = Class.forName("android.location.LocationRequest");
                    }
                    if (sRequestLocationUpdatesExecutorMethod == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, Executor.class, LocationListener.class);
                        sRequestLocationUpdatesExecutorMethod = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                    if (locationRequest != null) {
                        sRequestLocationUpdatesExecutorMethod.invoke(locationManager, locationRequest, executor, locationListenerCompat);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class LocationListenerTransport implements LocationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Executor mExecutor;
        public volatile LocationListenerKey mKey;

        public LocationListenerTransport(LocationListenerKey locationListenerKey, Executor executor) {
            this.mKey = locationListenerKey;
            this.mExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFlushComplete$2(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69d6ea8d", new Object[]{this, new Integer(i)});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onFlushComplete(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$0(Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32c51e7c", new Object[]{this, location});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onLocationChanged(location);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLocationChanged$1(List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79aa3d08", new Object[]{this, list});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onLocationChanged(list);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderDisabled$5(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee5a48eb", new Object[]{this, str});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onProviderDisabled(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onProviderEnabled$4(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8fe5fb5", new Object[]{this, str});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onProviderEnabled(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStatusChanged$3(String str, int i, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fe11b1b7", new Object[]{this, str, new Integer(i), bundle});
                return;
            }
            LocationListenerKey locationListenerKey = this.mKey;
            if (locationListenerKey != null) {
                locationListenerKey.mListener.onStatusChanged(str, i, bundle);
            }
        }

        public LocationListenerKey getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocationListenerKey) ipChange.ipc$dispatch("a74c78d9", new Object[]{this});
            }
            return (LocationListenerKey) ObjectsCompat.requireNonNull(this.mKey);
        }

        public void onFlushComplete(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("514d55e", new Object[]{this, new Integer(i)});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.bch
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onFlushComplete$2(i);
                    }
                });
            }
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(final Location location) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d13e08b", new Object[]{this, location});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.ach
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onLocationChanged$0(location);
                    }
                });
            }
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20eea11d", new Object[]{this, str});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.ybh
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onProviderDisabled$5(str);
                    }
                });
            }
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faf9c02", new Object[]{this, str});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.xbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onProviderEnabled$4(str);
                    }
                });
            }
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i, final Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adf45405", new Object[]{this, str, new Integer(i), bundle});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.cch
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onStatusChanged$3(str, i, bundle);
                    }
                });
            }
        }

        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.mKey = null;
            }
        }

        public void onLocationChanged(final List<Location> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e38738d8", new Object[]{this, list});
            } else if (this.mKey != null) {
                this.mExecutor.execute(new Runnable() { // from class: tb.zbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.LocationListenerTransport.this.lambda$onLocationChanged$1(list);
                    }
                });
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class PreRGnssStatusTransport extends GnssStatus.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final GnssStatusCompat.Callback mCallback;
        public volatile Executor mExecutor;

        public PreRGnssStatusTransport(GnssStatusCompat.Callback callback) {
            Preconditions.checkArgument(callback != null, "invalid null callback");
            this.mCallback = callback;
        }

        public static /* synthetic */ Object ipc$super(PreRGnssStatusTransport preRGnssStatusTransport, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/location/LocationManagerCompat$PreRGnssStatusTransport");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFirstFix$2(Executor executor, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bfec0c43", new Object[]{this, executor, new Integer(i)});
            } else if (this.mExecutor == executor) {
                this.mCallback.onFirstFix(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onSatelliteStatusChanged$3(Executor executor, GnssStatus gnssStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f939b551", new Object[]{this, executor, gnssStatus});
            } else if (this.mExecutor == executor) {
                this.mCallback.onSatelliteStatusChanged(GnssStatusCompat.wrap(gnssStatus));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStarted$0(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46f8cabe", new Object[]{this, executor});
            } else if (this.mExecutor == executor) {
                this.mCallback.onStarted();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStopped$1(Executor executor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad08d151", new Object[]{this, executor});
            } else if (this.mExecutor == executor) {
                this.mCallback.onStopped();
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(final int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8659a398", new Object[]{this, new Integer(i)});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.dch
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.PreRGnssStatusTransport.this.lambda$onFirstFix$2(executor, i);
                    }
                });
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("131dc7e1", new Object[]{this, gnssStatus});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.ech
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.PreRGnssStatusTransport.this.lambda$onSatelliteStatusChanged$3(executor, gnssStatus);
                    }
                });
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb092529", new Object[]{this});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.gch
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.PreRGnssStatusTransport.this.lambda$onStarted$0(executor);
                    }
                });
            }
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("436bf075", new Object[]{this});
                return;
            }
            final Executor executor = this.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: tb.fch
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocationManagerCompat.PreRGnssStatusTransport.this.lambda$onStopped$1(executor);
                    }
                });
            }
        }

        public void unregister() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("50cd9ac3", new Object[]{this});
            } else {
                this.mExecutor = null;
            }
        }

        public void register(Executor executor) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55b8732c", new Object[]{this, executor});
                return;
            }
            Preconditions.checkArgument(executor != null, "invalid null executor");
            if (this.mExecutor != null) {
                z = false;
            }
            Preconditions.checkState(z);
            this.mExecutor = executor;
        }
    }

    public static void getCurrentLocation(LocationManager locationManager, String str, android.os.CancellationSignal cancellationSignal, Executor executor, final Consumer<Location> consumer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12ebf443", new Object[]{locationManager, str, cancellationSignal, executor, consumer});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.getCurrentLocation(locationManager, str, cancellationSignal, executor, consumer);
        } else {
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
            if (lastKnownLocation == null || SystemClock.elapsedRealtime() - LocationCompat.getElapsedRealtimeMillis(lastKnownLocation) >= 10000) {
                final CancellableLocationListener cancellableLocationListener = new CancellableLocationListener(locationManager, executor, consumer);
                locationManager.requestLocationUpdates(str, 0L, 0.0f, cancellableLocationListener, Looper.getMainLooper());
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: tb.kbh
                        @Override // android.os.CancellationSignal.OnCancelListener
                        public final void onCancel() {
                            LocationManagerCompat.CancellableLocationListener.this.cancel();
                        }
                    });
                }
                cancellableLocationListener.startTimeout(30000L);
                return;
            }
            executor.execute(new Runnable() { // from class: tb.jbh
                @Override // java.lang.Runnable
                public final void run() {
                    LocationManagerCompat.lambda$getCurrentLocation$0(Consumer.this, lastKnownLocation);
                }
            });
        }
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager, Executor executor, GnssStatusCompat.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ef7a152", new Object[]{locationManager, executor, callback})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return registerGnssStatusCallback(locationManager, null, executor, callback);
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return registerGnssStatusCallback(locationManager, new Handler(myLooper), executor, callback);
    }

    private static boolean registerGnssMeasurementsCallbackOnR(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        if (Build.VERSION.SDK_INT == 30) {
            try {
                if (sGnssRequestBuilderClass == null) {
                    sGnssRequestBuilderClass = Class.forName("android.location.GnssRequest$Builder");
                }
                if (sGnssRequestBuilderBuildMethod == null) {
                    Method declaredMethod = sGnssRequestBuilderClass.getDeclaredMethod(CartRecommendRefreshScene.build, new Class[0]);
                    sGnssRequestBuilderBuildMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                if (sRegisterGnssMeasurementsCallbackMethod == null) {
                    Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, ibh.a());
                    sRegisterGnssMeasurementsCallbackMethod = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                Object invoke = sRegisterGnssMeasurementsCallbackMethod.invoke(locationManager, sGnssRequestBuilderBuildMethod.invoke(sGnssRequestBuilderClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, callback);
                if (invoke != null) {
                    if (((Boolean) invoke).booleanValue()) {
                        return true;
                    }
                }
                return false;
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                return false;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:49:0x00b7, B:60:0x00ce, B:61:0x00e4, B:62:0x00e5, B:64:0x00ed, B:66:0x00f5, B:67:0x00fb, B:68:0x00fc, B:69:0x0101, B:70:0x0102, B:71:0x0108), top: B:80:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0102 A[Catch: all -> 0x00bf, TryCatch #9 {all -> 0x00bf, blocks: (B:49:0x00b7, B:60:0x00ce, B:61:0x00e4, B:62:0x00e5, B:64:0x00ed, B:66:0x00f5, B:67:0x00fb, B:68:0x00fc, B:69:0x0101, B:70:0x0102, B:71:0x0108), top: B:80:0x0077 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean registerGnssStatusCallback(final android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.location.LocationManagerCompat.registerGnssStatusCallback(android.location.LocationManager, android.os.Handler, java.util.concurrent.Executor, androidx.core.location.GnssStatusCompat$Callback):boolean");
    }

    public static boolean registerGnssMeasurementsCallback(LocationManager locationManager, Executor executor, GnssMeasurementsEvent.Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa46ef66", new Object[]{locationManager, executor, callback})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 30) {
            return Api31Impl.registerGnssMeasurementsCallback(locationManager, executor, callback);
        }
        if (i == 30) {
            return registerGnssMeasurementsCallbackOnR(locationManager, executor, callback);
        }
        SimpleArrayMap<GnssMeasurementsEvent.Callback, GnssMeasurementsEvent.Callback> simpleArrayMap = GnssListenersHolder.sGnssMeasurementListeners;
        synchronized (simpleArrayMap) {
            try {
                GnssMeasurementsTransport gnssMeasurementsTransport = new GnssMeasurementsTransport(callback, executor);
                unregisterGnssMeasurementsCallback(locationManager, callback);
                if (!Api24Impl.registerGnssMeasurementsCallback(locationManager, gnssMeasurementsTransport)) {
                    return false;
                }
                simpleArrayMap.put(callback, gnssMeasurementsTransport);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api19Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static Class<?> sLocationRequestClass;
        private static Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
        }

        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerTransport locationListenerTransport) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, LocationListener.class, Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    synchronized (LocationManagerCompat.sLocationListeners) {
                        sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerTransport, Looper.getMainLooper());
                        LocationManagerCompat.registerLocationListenerTransport(locationManager, locationListenerTransport);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        public static boolean tryRequestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
            try {
                if (sLocationRequestClass == null) {
                    sLocationRequestClass = Class.forName("android.location.LocationRequest");
                }
                if (sRequestLocationUpdatesLooperMethod == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", sLocationRequestClass, LocationListener.class, Looper.class);
                    sRequestLocationUpdatesLooperMethod = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequest = locationRequestCompat.toLocationRequest(str);
                if (locationRequest != null) {
                    sRequestLocationUpdatesLooperMethod.invoke(locationManager, locationRequest, locationListenerCompat, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    public static void requestLocationUpdates(LocationManager locationManager, String str, LocationRequestCompat locationRequestCompat, LocationListenerCompat locationListenerCompat, Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c13af5aa", new Object[]{locationManager, str, locationRequestCompat, locationListenerCompat, looper});
        } else if (Build.VERSION.SDK_INT >= 31) {
            Api31Impl.requestLocationUpdates(locationManager, str, locationRequestCompat.toLocationRequest(), ExecutorCompat.create(new Handler(looper)), locationListenerCompat);
        } else if (!Api19Impl.tryRequestLocationUpdates(locationManager, str, locationRequestCompat, locationListenerCompat, looper)) {
            locationManager.requestLocationUpdates(str, locationRequestCompat.getIntervalMillis(), locationRequestCompat.getMinUpdateDistanceMeters(), locationListenerCompat, looper);
        }
    }
}
