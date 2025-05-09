package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.Display;
import android.view.DragEvent;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.content.ContextCompat;
import androidx.core.content.LocusIdCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.hi0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ActivityCompat extends ContextCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static PermissionCompatDelegate sDelegate;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api21Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api21Impl() {
        }

        public static void finishAfterTransition(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7011da57", new Object[]{activity});
            } else {
                activity.finishAfterTransition();
            }
        }

        public static void postponeEnterTransition(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c3dd8b0", new Object[]{activity});
            } else {
                activity.postponeEnterTransition();
            }
        }

        public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d351bff4", new Object[]{activity, sharedElementCallback});
            } else {
                activity.setEnterSharedElementCallback(sharedElementCallback);
            }
        }

        public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fd5227e", new Object[]{activity, sharedElementCallback});
            } else {
                activity.setExitSharedElementCallback(sharedElementCallback);
            }
        }

        public static void startPostponedEnterTransition(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d25281ba", new Object[]{activity});
            } else {
                activity.startPostponedEnterTransition();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api22Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api22Impl() {
        }

        public static Uri getReferrer(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Uri) ipChange.ipc$dispatch("42693325", new Object[]{activity});
            }
            return activity.getReferrer();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static void onSharedElementsReady(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("80a84cb", new Object[]{obj});
            } else {
                ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
            }
        }

        public static void requestPermissions(Activity activity, String[] strArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6191d92", new Object[]{activity, strArr, new Integer(i)});
            } else {
                activity.requestPermissions(strArr, i);
            }
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3585d8f0", new Object[]{activity, str})).booleanValue();
            }
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api28Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api28Impl() {
        }

        public static <T> T requireViewById(Activity activity, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("490ac984", new Object[]{activity, new Integer(i)});
            }
            return (T) activity.requireViewById(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api30Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api30Impl() {
        }

        public static Display getDisplay(ContextWrapper contextWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Display) ipChange.ipc$dispatch("934ecfa5", new Object[]{contextWrapper});
            }
            return contextWrapper.getDisplay();
        }

        public static void setLocusContext(Activity activity, LocusIdCompat locusIdCompat, Bundle bundle) {
            LocusId locusId;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35b2dcba", new Object[]{activity, locusIdCompat, bundle});
                return;
            }
            if (locusIdCompat == null) {
                locusId = null;
            } else {
                locusId = locusIdCompat.toLocusId();
            }
            activity.setLocusContext(locusId, bundle);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api32Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api32Impl() {
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3585d8f0", new Object[]{activity, str})).booleanValue();
            }
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface PermissionCompatDelegate {
        boolean onActivityResult(Activity activity, int i, int i2, Intent intent);

        boolean requestPermissions(Activity activity, String[] strArr, int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class SharedElementCallback21Impl extends SharedElementCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final SharedElementCallback mCallback;

        public SharedElementCallback21Impl(SharedElementCallback sharedElementCallback) {
            this.mCallback = sharedElementCallback;
        }

        public static /* synthetic */ Object ipc$super(SharedElementCallback21Impl sharedElementCallback21Impl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/ActivityCompat$SharedElementCallback21Impl");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSharedElementsArrived$0(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5d89f613", new Object[]{onSharedElementsReadyListener});
            } else {
                Api23Impl.onSharedElementsReady(onSharedElementsReadyListener);
            }
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Parcelable) ipChange.ipc$dispatch("e427edf9", new Object[]{this, view, matrix, rectF});
            }
            return this.mCallback.onCaptureSharedElementSnapshot(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("2db4a638", new Object[]{this, context, parcelable});
            }
            return this.mCallback.onCreateSnapshotView(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1003d994", new Object[]{this, list, map});
            } else {
                this.mCallback.onMapSharedElements(list, map);
            }
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb1e58f2", new Object[]{this, list});
            } else {
                this.mCallback.onRejectSharedElements(list);
            }
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eddfb25d", new Object[]{this, list, list2, list3});
            } else {
                this.mCallback.onSharedElementEnd(list, list2, list3);
            }
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e45e3e64", new Object[]{this, list, list2, list3});
            } else {
                this.mCallback.onSharedElementStart(list, list2, list3);
            }
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1cd93280", new Object[]{this, list, list2, onSharedElementsReadyListener});
            } else {
                this.mCallback.onSharedElementsArrived(list, list2, new SharedElementCallback.OnSharedElementsReadyListener() { // from class: tb.wa0
                    @Override // androidx.core.app.SharedElementCallback.OnSharedElementsReadyListener
                    public final void onSharedElementsReady() {
                        ActivityCompat.SharedElementCallback21Impl.lambda$onSharedElementsArrived$0(onSharedElementsReadyListener);
                    }
                });
            }
        }
    }

    public static void finishAffinity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49a777b4", new Object[]{activity});
        } else {
            activity.finishAffinity();
        }
    }

    public static void finishAfterTransition(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7011da57", new Object[]{activity});
        } else {
            Api21Impl.finishAfterTransition(activity);
        }
    }

    public static PermissionCompatDelegate getPermissionCompatDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PermissionCompatDelegate) ipChange.ipc$dispatch("e0ab5e33", new Object[0]);
        }
        return sDelegate;
    }

    public static Uri getReferrer(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("42693325", new Object[]{activity});
        }
        if (Build.VERSION.SDK_INT >= 22) {
            return Api22Impl.getReferrer(activity);
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    public static boolean invalidateOptionsMenu(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bae31aff", new Object[]{activity})).booleanValue();
        }
        activity.invalidateOptionsMenu();
        return true;
    }

    public static /* synthetic */ Object ipc$super(ActivityCompat activityCompat, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/ActivityCompat");
    }

    public static boolean isLaunchedFromBubble(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5e0aef", new Object[]{activity})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            return Api31Impl.isLaunchedFromBubble(activity);
        }
        if (i == 30) {
            if (Api30Impl.getDisplay(activity) == null || Api30Impl.getDisplay(activity).getDisplayId() == 0) {
                return false;
            }
            return true;
        } else if (i != 29 || activity.getWindowManager().getDefaultDisplay() == null || activity.getWindowManager().getDefaultDisplay().getDisplayId() == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$recreate$0(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19545551", new Object[]{activity});
        } else if (!activity.isFinishing() && !ActivityRecreator.recreate(activity)) {
            activity.recreate();
        }
    }

    public static void postponeEnterTransition(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c3dd8b0", new Object[]{activity});
        } else {
            Api21Impl.postponeEnterTransition(activity);
        }
    }

    public static void recreate(final Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7f6cc8", new Object[]{activity});
        } else if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new Runnable() { // from class: tb.va0
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityCompat.lambda$recreate$0(activity);
                }
            });
        }
    }

    public static DragAndDropPermissionsCompat requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragAndDropPermissionsCompat) ipChange.ipc$dispatch("e034476a", new Object[]{activity, dragEvent});
        }
        return DragAndDropPermissionsCompat.request(activity, dragEvent);
    }

    public static void requestPermissions(final Activity activity, String[] strArr, final int i) {
        final String[] strArr2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6191d92", new Object[]{activity, strArr, new Integer(i)});
            return;
        }
        PermissionCompatDelegate permissionCompatDelegate = sDelegate;
        if (permissionCompatDelegate == null || !permissionCompatDelegate.requestPermissions(activity, strArr, i)) {
            HashSet hashSet = new HashSet();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (!TextUtils.isEmpty(strArr[i2])) {
                    if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], hi0.POST_NOTIFICATIONS_PERMISSION)) {
                        hashSet.add(Integer.valueOf(i2));
                    }
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            if (size > 0) {
                strArr2 = new String[strArr.length - size];
            } else {
                strArr2 = strArr;
            }
            if (size > 0) {
                if (size != strArr.length) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < strArr.length; i4++) {
                        if (!hashSet.contains(Integer.valueOf(i4))) {
                            strArr2[i3] = strArr[i4];
                            i3++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof RequestPermissionsRequestCodeValidator) {
                    ((RequestPermissionsRequestCodeValidator) activity).validateRequestPermissionsRequestCode(i);
                }
                Api23Impl.requestPermissions(activity, strArr, i);
            } else if (activity instanceof OnRequestPermissionsResultCallback) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.core.app.ActivityCompat.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        int[] iArr = new int[strArr2.length];
                        PackageManager packageManager = activity.getPackageManager();
                        String packageName = activity.getPackageName();
                        int length = strArr2.length;
                        for (int i5 = 0; i5 < length; i5++) {
                            iArr[i5] = packageManager.checkPermission(strArr2[i5], packageName);
                        }
                        ((OnRequestPermissionsResultCallback) activity).onRequestPermissionsResult(i, strArr2, iArr);
                    }
                });
            }
        }
    }

    public static <T extends View> T requireViewById(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("8613030", new Object[]{activity, new Integer(i)}));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) ((View) Api28Impl.requireViewById(activity, i));
        }
        T t = (T) activity.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallback21Impl sharedElementCallback21Impl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("248fd09e", new Object[]{activity, sharedElementCallback});
            return;
        }
        if (sharedElementCallback != null) {
            sharedElementCallback21Impl = new SharedElementCallback21Impl(sharedElementCallback);
        } else {
            sharedElementCallback21Impl = null;
        }
        Api21Impl.setEnterSharedElementCallback(activity, sharedElementCallback21Impl);
    }

    public static void setExitSharedElementCallback(Activity activity, SharedElementCallback sharedElementCallback) {
        SharedElementCallback21Impl sharedElementCallback21Impl;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("699da3a8", new Object[]{activity, sharedElementCallback});
            return;
        }
        if (sharedElementCallback != null) {
            sharedElementCallback21Impl = new SharedElementCallback21Impl(sharedElementCallback);
        } else {
            sharedElementCallback21Impl = null;
        }
        Api21Impl.setExitSharedElementCallback(activity, sharedElementCallback21Impl);
    }

    public static void setLocusContext(Activity activity, LocusIdCompat locusIdCompat, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b2dcba", new Object[]{activity, locusIdCompat, bundle});
        } else if (Build.VERSION.SDK_INT >= 30) {
            Api30Impl.setLocusContext(activity, locusIdCompat, bundle);
        }
    }

    public static void setPermissionCompatDelegate(PermissionCompatDelegate permissionCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d025f1", new Object[]{permissionCompatDelegate});
        } else {
            sDelegate = permissionCompatDelegate;
        }
    }

    public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3585d8f0", new Object[]{activity, str})).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals(hi0.POST_NOTIFICATIONS_PERMISSION, str)) {
            return false;
        }
        if (i >= 32) {
            return Api32Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        if (i == 31) {
            return Api31Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        if (i >= 23) {
            return Api23Impl.shouldShowRequestPermissionRationale(activity, str);
        }
        return false;
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f3e33c", new Object[]{activity, intent, new Integer(i), bundle});
        } else {
            activity.startActivityForResult(intent, i, bundle);
        }
    }

    public static void startIntentSenderForResult(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b77271d", new Object[]{activity, intentSender, new Integer(i), intent, new Integer(i2), new Integer(i3), new Integer(i4), bundle});
        } else {
            activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public static void startPostponedEnterTransition(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d25281ba", new Object[]{activity});
        } else {
            Api21Impl.startPostponedEnterTransition(activity);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api31Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api31Impl() {
        }

        public static boolean isLaunchedFromBubble(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6b5e0aef", new Object[]{activity})).booleanValue();
            }
            return activity.isLaunchedFromBubble();
        }

        public static boolean shouldShowRequestPermissionRationale(Activity activity, String str) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }
}
