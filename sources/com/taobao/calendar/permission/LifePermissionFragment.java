package com.taobao.calendar.permission;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.taobao.calendar.bridge.jsbridge.CalendarJsBridge;
import tb.azl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LifePermissionFragment extends Fragment {
    public static final String TAG = "PermissionFragment";

    /* renamed from: a  reason: collision with root package name */
    public azl f10269a;
    public boolean c = false;

    static {
        t2o.a(693108773);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1000) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                azl azlVar = this.f10269a;
                if (azlVar != null) {
                    ((CalendarJsBridge.a) azlVar).a();
                }
            } else {
                azl azlVar2 = this.f10269a;
                if (azlVar2 != null) {
                    ((CalendarJsBridge.a) azlVar2).b();
                }
            }
            if (this.c) {
                try {
                    FragmentActivity activity = getActivity();
                    if (activity instanceof FragmentActivity) {
                        activity.getSupportFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        p2();
    }

    public final void p2() {
        if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_CALENDAR") != 0) {
            requestPermissions(new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}, 1000);
        }
    }

    public void r2(boolean z) {
        this.c = z;
    }

    public void s2(azl azlVar) {
        this.f10269a = azlVar;
    }
}
