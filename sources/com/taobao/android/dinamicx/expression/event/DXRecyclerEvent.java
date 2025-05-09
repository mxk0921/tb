package com.taobao.android.dinamicx.expression.event;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.HashMap;
import java.util.Map;
import tb.mw5;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerEvent extends DXEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int deltaX;
    public int deltaY;
    public int offsetX;
    public int offsetY;
    public DXWidgetNode selfWidget;
    public double speedRatio;
    public String userId;

    static {
        t2o.a(444596810);
    }

    public DXRecyclerEvent(long j) {
        super(j);
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerEvent dXRecyclerEvent, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/event/DXRecyclerEvent");
    }

    public int getDeltaX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fb62810", new Object[]{this})).intValue();
        }
        return this.deltaX;
    }

    public int getDeltaY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fc43f91", new Object[]{this})).intValue();
        }
        return this.deltaY;
    }

    public int getOffsetX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25635ee9", new Object[]{this})).intValue();
        }
        return this.offsetX;
    }

    public int getOffsetY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2571766a", new Object[]{this})).intValue();
        }
        return this.offsetY;
    }

    public DXWidgetNode getSelfWidget() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("5ca3b54c", new Object[]{this});
        }
        return this.selfWidget;
    }

    public double getSpeedRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e7c236f", new Object[]{this})).doubleValue();
        }
        return this.speedRatio;
    }

    public String getUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.userId;
    }

    public void setDataToArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea25acb", new Object[]{this});
        } else {
            setDataToArgs(null);
        }
    }

    public void setDeltaX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d74c1fa", new Object[]{this, new Integer(i)});
        } else {
            this.deltaX = i;
        }
    }

    public void setDeltaY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f299a99", new Object[]{this, new Integer(i)});
        } else {
            this.deltaY = i;
        }
    }

    public void setOffsetX(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd51edd9", new Object[]{this, new Integer(i)});
        } else {
            this.offsetX = i;
        }
    }

    public void setOffsetY(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf06c678", new Object[]{this, new Integer(i)});
        } else {
            this.offsetY = i;
        }
    }

    public void setSelfWidget(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c68d216", new Object[]{this, dXWidgetNode});
        } else {
            this.selfWidget = dXWidgetNode;
        }
    }

    public void setSpeedRatio(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87df4651", new Object[]{this, new Double(d)});
        } else {
            this.speedRatio = d;
        }
    }

    public void setUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca419d9", new Object[]{this, str});
        } else {
            this.userId = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DXRecyclerEvent{, deltaY=" + this.deltaY + ", deltaX=" + this.deltaX + ", offsetY=" + this.offsetY + ", offsetX=" + this.offsetX + ", userId='" + this.userId + "', selfWidget=" + this.selfWidget + '}';
    }

    public void setDataToArgs(Map<String, mw5> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b81b315a", new Object[]{this, map});
            return;
        }
        Map<String, mw5> args = getArgs();
        if (args == null) {
            args = new HashMap<>();
        }
        if (map != null && !map.isEmpty()) {
            args.putAll(map);
        }
        args.put("deltaY", mw5.K(this.deltaY));
        args.put("deltaX", mw5.K(this.deltaX));
        args.put("offsetX", mw5.K(this.offsetX));
        args.put("offsetY", mw5.K(this.offsetY));
        if (!TextUtils.isEmpty(this.userId)) {
            args.put("userId", mw5.O(this.userId));
        }
        args.put("direction", mw5.O(this.deltaY > 0 ? "up" : "down"));
        DXWidgetNode dXWidgetNode = this.selfWidget;
        if (dXWidgetNode != null) {
            args.put("selfWidget", mw5.L(dXWidgetNode));
        }
        setArgs(args);
    }
}
