package com.alibaba.security.realidentity;

import android.app.Activity;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import com.alibaba.security.realidentity.service.sensor.model.DisplayInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class v3 extends u3<List<DisplayInfo>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DisplayManager c;
    public Display d;

    public v3(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(v3 v3Var, String str, Object... objArr) {
        if (str.hashCode() == -1548715975) {
            super.a((z3) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/v3");
    }

    @Override // com.alibaba.security.realidentity.u3
    public void a(z3 z3Var) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b07839", new Object[]{this, z3Var});
            return;
        }
        super.a(z3Var);
        if (Build.VERSION.SDK_INT >= 23) {
            this.c = (DisplayManager) this.f2829a.getSystemService("display");
        } else {
            this.d = this.f2829a.getWindowManager().getDefaultDisplay();
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    /* renamed from: f */
    public List<DisplayInfo> b() {
        Display.Mode mode;
        int modeId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23) {
            Display[] displays = this.c.getDisplays();
            if (displays == null || displays.length <= 0) {
                return null;
            }
            for (Display display : displays) {
                DisplayInfo displayInfo = new DisplayInfo();
                displayInfo.modes = a(display);
                displayInfo.displayId = display.getDisplayId();
                mode = display.getMode();
                modeId = mode.getModeId();
                displayInfo.modeID = modeId;
                displayInfo.rotation = display.getRotation();
                a(displayInfo);
                displayInfo.state = display.getState();
                displayInfo.type = display.getFlags();
                arrayList.add(displayInfo);
            }
        } else if (this.d == null) {
            return null;
        } else {
            DisplayInfo displayInfo2 = new DisplayInfo();
            displayInfo2.modes = a(this.d);
            displayInfo2.displayId = this.d.getDisplayId();
            displayInfo2.modeID = this.d.getDisplayId();
            displayInfo2.rotation = this.d.getRotation();
            a(displayInfo2);
            displayInfo2.state = 0;
            displayInfo2.type = 0;
            arrayList.add(displayInfo2);
        }
        return arrayList;
    }

    private void a(DisplayInfo displayInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1dcc063", new Object[]{this, displayInfo});
        } else if (displayInfo != null && this.f2829a != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f2829a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            displayInfo.density = displayMetrics.density;
            displayInfo.densityDPI = displayMetrics.densityDpi;
            displayInfo.width = displayMetrics.widthPixels;
            displayInfo.height = displayMetrics.heightPixels;
            displayInfo.scaleDensity = displayMetrics.scaledDensity;
            displayInfo.xdip = displayMetrics.xdpi;
            displayInfo.ydip = displayMetrics.ydpi;
        }
    }

    private List<DisplayInfo.a> a(Display display) {
        Display.Mode[] supportedModes;
        int modeId;
        int physicalWidth;
        int physicalHeight;
        float refreshRate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7cf7c068", new Object[]{this, display});
        }
        if (display == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 23) {
            supportedModes = display.getSupportedModes();
            if (supportedModes == null || supportedModes.length <= 0) {
                return null;
            }
            for (Display.Mode mode : supportedModes) {
                DisplayInfo.a aVar = new DisplayInfo.a();
                modeId = mode.getModeId();
                aVar.d = modeId;
                physicalWidth = mode.getPhysicalWidth();
                aVar.b = physicalWidth;
                physicalHeight = mode.getPhysicalHeight();
                aVar.c = physicalHeight;
                refreshRate = mode.getRefreshRate();
                aVar.f2819a = refreshRate;
                arrayList.add(aVar);
            }
        } else {
            DisplayInfo.a aVar2 = new DisplayInfo.a();
            Point point = new Point();
            display.getRealSize(point);
            aVar2.d = 0;
            aVar2.b = point.x;
            aVar2.c = point.y;
            aVar2.f2819a = display.getRefreshRate();
            arrayList.add(aVar2);
        }
        return arrayList;
    }
}
