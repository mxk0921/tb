package com.alibaba.security.realidentity;

import android.app.Activity;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.alibaba.security.realidentity.service.sensor.api.RpSecException;
import com.alibaba.security.realidentity.service.sensor.model.MotionEventData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class w3 extends u3<List<MotionEventData>> implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile boolean c = false;
    public final List<MotionEventData> d = new ArrayList();
    public View e;

    public w3(Activity activity) {
        super(activity);
    }

    public static /* synthetic */ Object ipc$super(w3 w3Var, String str, Object... objArr) {
        if (str.hashCode() == -1548715975) {
            super.a((z3) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/w3");
    }

    @Override // com.alibaba.security.realidentity.u3
    public void a(z3 z3Var) throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3b07839", new Object[]{this, z3Var});
            return;
        }
        super.a(z3Var);
        Activity activity = this.f2829a;
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                this.e = decorView;
                if (decorView == null) {
                    throw new RpSecException("No DecorView found from current activity", (int) RpSecException.EXCEPTION_NO_DECOR_VIEW_FOUND);
                }
                return;
            }
            throw new RpSecException("No window found from current activity", (int) RpSecException.EXCEPTION_NO_WINDOW_FOUND_FROM_ACTIVITY);
        }
        throw new RpSecException("No activity found when initialized", -100);
    }

    @Override // com.alibaba.security.realidentity.u3
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        List<MotionEventData> list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public void d() throws RpSecException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.e != null) {
            this.c = true;
            this.e.setOnTouchListener(this);
        } else {
            throw new RpSecException("No DecorView found from current activity while start", (int) RpSecException.EXCEPTION_NO_DECOR_VIEW_FOUND);
        }
    }

    @Override // com.alibaba.security.realidentity.u3
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        this.c = false;
        return false;
    }

    /* renamed from: f */
    public List<MotionEventData> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this});
        }
        return this.d;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEventData a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (b(motionEvent) && (a2 = a(motionEvent)) != null) {
            this.d.add(a2);
        }
        return false;
    }

    private boolean b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("74207cc2", new Object[]{this, motionEvent})).booleanValue() : this.c && this.d.size() <= this.b.b() && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1);
    }

    private MotionEventData a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MotionEventData) ipChange.ipc$dispatch("e2c33836", new Object[]{this, motionEvent});
        }
        if (motionEvent == null) {
            return null;
        }
        MotionEventData motionEventData = new MotionEventData();
        motionEventData.action = motionEvent.getAction();
        motionEventData.deviceID = motionEvent.getDeviceId();
        motionEventData.downTime = motionEvent.getDownTime();
        motionEventData.elapsedRealtime = SystemClock.elapsedRealtime();
        motionEventData.eventTime = motionEvent.getEventTime();
        motionEventData.pressure = motionEvent.getPressure();
        motionEventData.size = motionEvent.getSize();
        motionEventData.toolType = motionEvent.getToolType(0);
        motionEventData.x = motionEvent.getX();
        motionEventData.y = motionEvent.getY();
        return motionEventData;
    }
}
