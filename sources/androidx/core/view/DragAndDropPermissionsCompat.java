package androidx.core.view;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class DragAndDropPermissionsCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final DragAndDropPermissions mDragAndDropPermissions;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api24Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api24Impl() {
        }

        public static void release(DragAndDropPermissions dragAndDropPermissions) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e71e0eb7", new Object[]{dragAndDropPermissions});
            } else {
                dragAndDropPermissions.release();
            }
        }

        public static DragAndDropPermissions requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DragAndDropPermissions) ipChange.ipc$dispatch("e1af85a2", new Object[]{activity, dragEvent});
            }
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.mDragAndDropPermissions = dragAndDropPermissions;
    }

    public static DragAndDropPermissionsCompat request(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DragAndDropPermissionsCompat) ipChange.ipc$dispatch("c6632178", new Object[]{activity, dragEvent});
        }
        if (Build.VERSION.SDK_INT < 24 || (requestDragAndDropPermissions = Api24Impl.requestDragAndDropPermissions(activity, dragEvent)) == null) {
            return null;
        }
        return new DragAndDropPermissionsCompat(requestDragAndDropPermissions);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 24) {
            Api24Impl.release(this.mDragAndDropPermissions);
        }
    }
}
