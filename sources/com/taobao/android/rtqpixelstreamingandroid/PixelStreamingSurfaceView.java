package com.taobao.android.rtqpixelstreamingandroid;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.rtqpixelstreamingandroid.RTQPixelStreamingMessage;
import java.util.ArrayList;
import java.util.HashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PixelStreamingSurfaceView extends SurfaceView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PSView";
    public String mSessionIdentifier = "";
    public boolean disabledNativeInput = false;
    private final ArrayList<Integer> fingers = new ArrayList<>();
    private final HashMap<Integer, Integer> _fingerIds = new HashMap<>();

    static {
        t2o.a(316669965);
    }

    public PixelStreamingSurfaceView(Context context) {
        super(context);
        for (int i = 9; i >= 0; i--) {
            this.fingers.add(Integer.valueOf(i));
        }
    }

    private void emitTouchData(RTQPixelStreamingMessage.MessageType messageType, ArrayList<RTQPixelStreamingMessage.a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d4dafef", new Object[]{this, messageType, arrayList});
        } else {
            PixelStreamingNativeLib.sendTransportData(this.mSessionIdentifier, RTQPixelStreamingMessage.a(messageType, arrayList).f9322a);
        }
    }

    private void forgetTouch(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d520cfe", new Object[]{this, num});
            return;
        }
        if (this._fingerIds.containsKey(num)) {
            this.fingers.add(this._fingerIds.get(num));
        }
        this._fingerIds.remove(num);
    }

    private RTQPixelStreamingMessage.a getTouchInfo(int i, int i2, MotionEvent motionEvent) {
        float f;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RTQPixelStreamingMessage.a) ipChange.ipc$dispatch("5dd79d5", new Object[]{this, new Integer(i), new Integer(i2), motionEvent});
        }
        RTQPixelStreamingMessage.a aVar = new RTQPixelStreamingMessage.a();
        int width = getWidth();
        int height = getHeight();
        aVar.c = motionEvent.getPressure(i);
        if (this._fingerIds.containsKey(Integer.valueOf(i2))) {
            aVar.e = this._fingerIds.get(Integer.valueOf(i2)).intValue();
        } else {
            aVar.e = i;
        }
        if (width == 0 || height == 0) {
            aVar.f9323a = 65535;
            aVar.b = 65535;
            aVar.d = Boolean.FALSE;
            return aVar;
        }
        float f3 = height;
        float f4 = width;
        float f5 = f3 / f4;
        float f6 = PixelStreamingJniHelper.videoHeight / PixelStreamingJniHelper.videoWidth;
        float x = motionEvent.getX(i);
        float y = motionEvent.getY(i);
        if (f5 > f6) {
            f = x / f4;
            f2 = ((f5 / f6) * ((y / f3) - 0.5f)) + 0.5f;
        } else {
            f = ((f6 / f5) * ((x / f4) - 0.5f)) + 0.5f;
            f2 = y / f3;
        }
        if (f < 0.0f || f > 1.0f || f2 < 0.0f || f2 > 1.0f) {
            aVar.f9323a = 65535;
            aVar.b = 65535;
            aVar.d = Boolean.FALSE;
            return aVar;
        }
        aVar.f9323a = (int) (f * 65536.0f);
        aVar.b = (int) (f2 * 65536.0f);
        aVar.d = Boolean.TRUE;
        return aVar;
    }

    public static /* synthetic */ Object ipc$super(PixelStreamingSurfaceView pixelStreamingSurfaceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/PixelStreamingSurfaceView");
    }

    private void rememberTouch(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d250e19e", new Object[]{this, num});
        } else if (!this.fingers.isEmpty()) {
            ArrayList<Integer> arrayList = this.fingers;
            ArrayList<Integer> arrayList2 = this.fingers;
            arrayList2.remove(arrayList2.size() - 1);
            this._fingerIds.put(num, arrayList.get(arrayList.size() - 1));
        }
    }

    private void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.fingers.clear();
        for (int i = 9; i >= 0; i--) {
            this.fingers.add(Integer.valueOf(i));
        }
        this._fingerIds.clear();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.disabledNativeInput) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            int pointerId = motionEvent.getPointerId(0);
            rememberTouch(Integer.valueOf(pointerId));
            ArrayList<RTQPixelStreamingMessage.a> arrayList = new ArrayList<>();
            arrayList.add(getTouchInfo(0, pointerId, motionEvent));
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchStart, arrayList);
        } else if (action == 1) {
            int pointerId2 = motionEvent.getPointerId(0);
            RTQPixelStreamingMessage.a touchInfo = getTouchInfo(0, pointerId2, motionEvent);
            ArrayList<RTQPixelStreamingMessage.a> arrayList2 = new ArrayList<>();
            arrayList2.add(touchInfo);
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchEnd, arrayList2);
            forgetTouch(Integer.valueOf(pointerId2));
            reset();
        } else if (action == 2) {
            int pointerCount = motionEvent.getPointerCount();
            ArrayList<RTQPixelStreamingMessage.a> arrayList3 = new ArrayList<>();
            while (i < pointerCount) {
                arrayList3.add(getTouchInfo(i, motionEvent.getPointerId(i), motionEvent));
                i++;
            }
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchMove, arrayList3);
        } else if (action == 3) {
            int pointerCount2 = motionEvent.getPointerCount();
            ArrayList<RTQPixelStreamingMessage.a> arrayList4 = new ArrayList<>();
            while (i < pointerCount2) {
                int pointerId3 = motionEvent.getPointerId(i);
                arrayList4.add(getTouchInfo(i, pointerId3, motionEvent));
                forgetTouch(Integer.valueOf(pointerId3));
                i++;
            }
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchEnd, arrayList4);
            reset();
        } else if (action == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            rememberTouch(Integer.valueOf(pointerId4));
            RTQPixelStreamingMessage.a touchInfo2 = getTouchInfo(actionIndex, pointerId4, motionEvent);
            ArrayList<RTQPixelStreamingMessage.a> arrayList5 = new ArrayList<>();
            arrayList5.add(touchInfo2);
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchStart, arrayList5);
        } else if (action == 6) {
            int actionIndex2 = motionEvent.getActionIndex();
            int pointerId5 = motionEvent.getPointerId(actionIndex2);
            RTQPixelStreamingMessage.a touchInfo3 = getTouchInfo(actionIndex2, pointerId5, motionEvent);
            ArrayList<RTQPixelStreamingMessage.a> arrayList6 = new ArrayList<>();
            arrayList6.add(touchInfo3);
            emitTouchData(RTQPixelStreamingMessage.MessageType.TouchEnd, arrayList6);
            forgetTouch(Integer.valueOf(pointerId5));
        }
        return true;
    }
}
