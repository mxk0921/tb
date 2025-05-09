package com.taobao.message.sp.framework.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class SimpleMessageReceiverState implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MessageReceiverStateItem unread = new MessageReceiverStateItem(0, false);
    private MessageReceiverStateItem read = new MessageReceiverStateItem(0, false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class MessageReceiverStateItem implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private boolean all;
        private int count;

        static {
            t2o.a(552599676);
        }

        public MessageReceiverStateItem() {
        }

        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.count;
        }

        public boolean isAll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a7008d22", new Object[]{this})).booleanValue();
            }
            return this.all;
        }

        public void setAll(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("deecc0ae", new Object[]{this, new Boolean(z)});
            } else {
                this.all = z;
            }
        }

        public void setCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dbdc85af", new Object[]{this, new Integer(i)});
            } else {
                this.count = i;
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MessageReceiverStateItem{count=" + this.count + ", all=" + this.all + '}';
        }

        public MessageReceiverStateItem(int i, boolean z) {
            this.count = 0;
            this.all = z;
        }
    }

    static {
        t2o.a(552599675);
    }

    public MessageReceiverStateItem getRead() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageReceiverStateItem) ipChange.ipc$dispatch("9a2d42d", new Object[]{this});
        }
        return this.read;
    }

    public MessageReceiverStateItem getUnread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageReceiverStateItem) ipChange.ipc$dispatch("5f510f06", new Object[]{this});
        }
        return this.unread;
    }

    public void setRead(MessageReceiverStateItem messageReceiverStateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1140c7eb", new Object[]{this, messageReceiverStateItem});
        } else {
            this.read = messageReceiverStateItem;
        }
    }

    public void setUnread(MessageReceiverStateItem messageReceiverStateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc9db32", new Object[]{this, messageReceiverStateItem});
        } else {
            this.unread = messageReceiverStateItem;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "MessageReceiverState{unread=" + this.unread + ", read=" + this.read + '}';
    }
}
