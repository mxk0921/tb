package de.greenrobot.event.util;

import android.app.Fragment;
import android.os.Bundle;
import tb.tst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ErrorDialogManager {
    public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
    public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
    public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
    public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
    public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class HoneycombManagerFragment extends Fragment {
        public void onEventMainThread(tst tstVar) {
            ErrorDialogManager.a(tstVar);
            throw null;
        }

        @Override // android.app.Fragment
        public void onPause() {
            throw null;
        }

        @Override // android.app.Fragment
        public void onResume() {
            super.onResume();
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class SupportManagerFragment extends androidx.fragment.app.Fragment {
        @Override // androidx.fragment.app.Fragment
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            throw null;
        }

        public void onEventMainThread(tst tstVar) {
            ErrorDialogManager.a(tstVar);
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onPause() {
            throw null;
        }

        @Override // androidx.fragment.app.Fragment
        public void onResume() {
            super.onResume();
            throw null;
        }
    }

    public static void a(tst tstVar) {
        throw null;
    }
}
