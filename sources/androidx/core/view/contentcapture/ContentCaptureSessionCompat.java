package androidx.core.view.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewStructureCompat;
import androidx.core.view.autofill.AutofillIdCompat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Objects;
import tb.cgw;
import tb.lo4;
import tb.ql1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ContentCaptureSessionCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final View mView;
    private final Object mWrappedObj;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api23Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api23Impl() {
        }

        public static Bundle getExtras(ViewStructure viewStructure) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("5901ff2f", new Object[]{viewStructure});
            }
            return viewStructure.getExtras();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api29Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api29Impl() {
        }

        public static AutofillId newAutofillId(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AutofillId) ipChange.ipc$dispatch("8d7621cc", new Object[]{contentCaptureSession, autofillId, new Long(j)});
            }
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static ViewStructure newViewStructure(ContentCaptureSession contentCaptureSession, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewStructure) ipChange.ipc$dispatch("552106aa", new Object[]{contentCaptureSession, view});
            }
            return contentCaptureSession.newViewStructure(view);
        }

        public static ViewStructure newVirtualViewStructure(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewStructure) ipChange.ipc$dispatch("dd852c92", new Object[]{contentCaptureSession, autofillId, new Long(j)});
            }
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        public static void notifyViewAppeared(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9f476992", new Object[]{contentCaptureSession, viewStructure});
            } else {
                contentCaptureSession.notifyViewAppeared(viewStructure);
            }
        }

        public static void notifyViewTextChanged(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d59ff103", new Object[]{contentCaptureSession, autofillId, charSequence});
            } else {
                contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
            }
        }

        public static void notifyViewsDisappeared(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7c042aa", new Object[]{contentCaptureSession, autofillId, jArr});
            } else {
                contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Api34Impl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        private Api34Impl() {
        }

        public static void notifyViewsAppeared(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26aaab41", new Object[]{contentCaptureSession, list});
            } else {
                contentCaptureSession.notifyViewsAppeared(list);
            }
        }
    }

    private ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    public static ContentCaptureSessionCompat toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContentCaptureSessionCompat) ipChange.ipc$dispatch("6fbc5581", new Object[]{contentCaptureSession, view});
        }
        return new ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public AutofillId newAutofillId(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ql1.a(ipChange.ipc$dispatch("b65377b5", new Object[]{this, new Long(j)}));
        }
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession a2 = lo4.a(this.mWrappedObj);
        AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
        Objects.requireNonNull(autofillId);
        return Api29Impl.newAutofillId(a2, autofillId.toAutofillId(), j);
    }

    public ViewStructureCompat newVirtualViewStructure(AutofillId autofillId, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewStructureCompat) ipChange.ipc$dispatch("d2722b8a", new Object[]{this, autofillId, new Long(j)});
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return ViewStructureCompat.toViewStructureCompat(Api29Impl.newVirtualViewStructure(lo4.a(this.mWrappedObj), autofillId, j));
        }
        return null;
    }

    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a41ceb3", new Object[]{this, autofillId, charSequence});
        } else if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.notifyViewTextChanged(lo4.a(this.mWrappedObj), autofillId, charSequence);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69530d73", new Object[]{this, jArr});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ContentCaptureSession a2 = lo4.a(this.mWrappedObj);
            AutofillIdCompat autofillId = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId);
            Api29Impl.notifyViewsDisappeared(a2, autofillId.toAutofillId(), jArr);
        } else if (i >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure(lo4.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(lo4.a(this.mWrappedObj), newViewStructure);
            ContentCaptureSession a3 = lo4.a(this.mWrappedObj);
            AutofillIdCompat autofillId2 = ViewCompat.getAutofillId(this.mView);
            Objects.requireNonNull(autofillId2);
            Api29Impl.notifyViewsDisappeared(a3, autofillId2.toAutofillId(), jArr);
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure(lo4.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(lo4.a(this.mWrappedObj), newViewStructure2);
        }
    }

    public ContentCaptureSession toContentCaptureSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return lo4.a(ipChange.ipc$dispatch("205765d5", new Object[]{this}));
        }
        return lo4.a(this.mWrappedObj);
    }

    public void notifyViewsAppeared(List<ViewStructure> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc4fdb1", new Object[]{this, list});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            Api34Impl.notifyViewsAppeared(lo4.a(this.mWrappedObj), list);
        } else if (i >= 29) {
            ViewStructure newViewStructure = Api29Impl.newViewStructure(lo4.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            Api29Impl.notifyViewAppeared(lo4.a(this.mWrappedObj), newViewStructure);
            for (int i2 = 0; i2 < list.size(); i2++) {
                Api29Impl.notifyViewAppeared(lo4.a(this.mWrappedObj), cgw.a(list.get(i2)));
            }
            ViewStructure newViewStructure2 = Api29Impl.newViewStructure(lo4.a(this.mWrappedObj), this.mView);
            Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            Api29Impl.notifyViewAppeared(lo4.a(this.mWrappedObj), newViewStructure2);
        }
    }
}
