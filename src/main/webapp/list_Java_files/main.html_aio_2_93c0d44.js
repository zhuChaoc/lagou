/*!common/components/jquery-ui-custom/jquery-ui.custom.js*/
;define("common/components/jquery-ui-custom/jquery-ui.custom",["require","exports","module"],function(){!function(a,h){function c(h,c){var g,_,b,y=h.nodeName.toLowerCase();return"area"===y?(g=h.parentNode,_=g.name,h.href&&_&&"map"===g.nodeName.toLowerCase()?(b=a("img[usemap=#"+_+"]")[0],!!b&&v(b)):!1):(/input|select|textarea|button|object/.test(y)?!h.disabled:"a"===y?h.href||c:c)&&v(h)}function v(h){return a.expr.filters.visible(h)&&!a(h).parents().addBack().filter(function(){return"hidden"===a.css(this,"visibility")}).length}var g=0,_=/^ui-id-\d+$/;a.ui=a.ui||{},a.extend(a.ui,{version:"1.10.4",keyCode:{BACKSPACE:8,COMMA:188,DELETE:46,DOWN:40,END:35,ENTER:13,ESCAPE:27,HOME:36,LEFT:37,NUMPAD_ADD:107,NUMPAD_DECIMAL:110,NUMPAD_DIVIDE:111,NUMPAD_ENTER:108,NUMPAD_MULTIPLY:106,NUMPAD_SUBTRACT:109,PAGE_DOWN:34,PAGE_UP:33,PERIOD:190,RIGHT:39,SPACE:32,TAB:9,UP:38}}),a.fn.extend({focus:function(h){return function(c,v){return"number"==typeof c?this.each(function(){var h=this;setTimeout(function(){a(h).focus(),v&&v.call(h)},c)}):h.apply(this,arguments)}}(a.fn.focus),scrollParent:function(){var h;return h=a.ui.ie&&/(static|relative)/.test(this.css("position"))||/absolute/.test(this.css("position"))?this.parents().filter(function(){return/(relative|absolute|fixed)/.test(a.css(this,"position"))&&/(auto|scroll)/.test(a.css(this,"overflow")+a.css(this,"overflow-y")+a.css(this,"overflow-x"))}).eq(0):this.parents().filter(function(){return/(auto|scroll)/.test(a.css(this,"overflow")+a.css(this,"overflow-y")+a.css(this,"overflow-x"))}).eq(0),/fixed/.test(this.css("position"))||!h.length?a(document):h},zIndex:function(c){if(c!==h)return this.css("zIndex",c);if(this.length)for(var v,g,_=a(this[0]);_.length&&_[0]!==document;){if(v=_.css("position"),("absolute"===v||"relative"===v||"fixed"===v)&&(g=parseInt(_.css("zIndex"),10),!isNaN(g)&&0!==g))return g;_=_.parent()}return 0},uniqueId:function(){return this.each(function(){this.id||(this.id="ui-id-"+ ++g)})},removeUniqueId:function(){return this.each(function(){_.test(this.id)&&a(this).removeAttr("id")})}}),a.extend(a.expr[":"],{data:a.expr.createPseudo?a.expr.createPseudo(function(h){return function(c){return!!a.data(c,h)}}):function(h,i,c){return!!a.data(h,c[3])},focusable:function(h){return c(h,!isNaN(a.attr(h,"tabindex")))},tabbable:function(h){var v=a.attr(h,"tabindex"),g=isNaN(v);return(g||v>=0)&&c(h,!g)}}),a("<a>").outerWidth(1).jquery||a.each(["Width","Height"],function(i,c){function v(h,c,v,_){return a.each(g,function(){c-=parseFloat(a.css(h,"padding"+this))||0,v&&(c-=parseFloat(a.css(h,"border"+this+"Width"))||0),_&&(c-=parseFloat(a.css(h,"margin"+this))||0)}),c}var g="Width"===c?["Left","Right"]:["Top","Bottom"],_=c.toLowerCase(),b={innerWidth:a.fn.innerWidth,innerHeight:a.fn.innerHeight,outerWidth:a.fn.outerWidth,outerHeight:a.fn.outerHeight};a.fn["inner"+c]=function(g){return g===h?b["inner"+c].call(this):this.each(function(){a(this).css(_,v(this,g)+"px")})},a.fn["outer"+c]=function(h,g){return"number"!=typeof h?b["outer"+c].call(this,h):this.each(function(){a(this).css(_,v(this,h,!0,g)+"px")})}}),a.fn.addBack||(a.fn.addBack=function(a){return this.add(null==a?this.prevObject:this.prevObject.filter(a))}),a("<a>").data("a-b","a").removeData("a-b").data("a-b")&&(a.fn.removeData=function(h){return function(c){return arguments.length?h.call(this,a.camelCase(c)):h.call(this)}}(a.fn.removeData)),a.ui.ie=!!/msie [\w.]+/.exec(navigator.userAgent.toLowerCase()),a.support.selectstart="onselectstart"in document.createElement("div"),a.fn.extend({disableSelection:function(){return this.bind((a.support.selectstart?"selectstart":"mousedown")+".ui-disableSelection",function(a){a.preventDefault()})},enableSelection:function(){return this.unbind(".ui-disableSelection")}}),a.extend(a.ui,{plugin:{add:function(module,h,c){var i,v=a.ui[module].prototype;for(i in c)v.plugins[i]=v.plugins[i]||[],v.plugins[i].push([h,c[i]])},call:function(a,h,c){var i,v=a.plugins[h];if(v&&a.element[0].parentNode&&11!==a.element[0].parentNode.nodeType)for(i=0;i<v.length;i++)a.options[v[i][0]]&&v[i][1].apply(a.element,c)}},hasScroll:function(h,c){if("hidden"===a(h).css("overflow"))return!1;var v=c&&"left"===c?"scrollLeft":"scrollTop",g=!1;return h[v]>0?!0:(h[v]=1,g=h[v]>0,h[v]=0,g)}})}(jQuery),function(a,h){var c=0,v=Array.prototype.slice,g=a.cleanData;a.cleanData=function(h){for(var c,i=0;null!=(c=h[i]);i++)try{a(c).triggerHandler("remove")}catch(e){}g(h)},a.widget=function(h,c,v){var g,_,b,y,w={},C=h.split(".")[0];h=h.split(".")[1],g=C+"-"+h,v||(v=c,c=a.Widget),a.expr[":"][g.toLowerCase()]=function(h){return!!a.data(h,g)},a[C]=a[C]||{},_=a[C][h],b=a[C][h]=function(a,h){return this._createWidget?void(arguments.length&&this._createWidget(a,h)):new b(a,h)},a.extend(b,_,{version:v.version,_proto:a.extend({},v),_childConstructors:[]}),y=new c,y.options=a.widget.extend({},y.options),a.each(v,function(h,v){return a.isFunction(v)?void(w[h]=function(){var a=function(){return c.prototype[h].apply(this,arguments)},g=function(a){return c.prototype[h].apply(this,a)};return function(){var h,c=this._super,_=this._superApply;return this._super=a,this._superApply=g,h=v.apply(this,arguments),this._super=c,this._superApply=_,h}}()):void(w[h]=v)}),b.prototype=a.widget.extend(y,{widgetEventPrefix:_?y.widgetEventPrefix||h:h},w,{constructor:b,namespace:C,widgetName:h,widgetFullName:g}),_?(a.each(_._childConstructors,function(i,h){var c=h.prototype;a.widget(c.namespace+"."+c.widgetName,b,h._proto)}),delete _._childConstructors):c._childConstructors.push(b),a.widget.bridge(h,b)},a.widget.extend=function(c){for(var g,_,b=v.call(arguments,1),y=0,w=b.length;w>y;y++)for(g in b[y])_=b[y][g],b[y].hasOwnProperty(g)&&_!==h&&(c[g]=a.isPlainObject(_)?a.isPlainObject(c[g])?a.widget.extend({},c[g],_):a.widget.extend({},_):_);return c},a.widget.bridge=function(c,g){var _=g.prototype.widgetFullName||c;a.fn[c]=function(b){var y="string"==typeof b,w=v.call(arguments,1),C=this;return b=!y&&w.length?a.widget.extend.apply(null,[b].concat(w)):b,this.each(y?function(){var v,g=a.data(this,_);return g?a.isFunction(g[b])&&"_"!==b.charAt(0)?(v=g[b].apply(g,w),v!==g&&v!==h?(C=v&&v.jquery?C.pushStack(v.get()):v,!1):void 0):a.error("no such method '"+b+"' for "+c+" widget instance"):a.error("cannot call methods on "+c+" prior to initialization; attempted to call method '"+b+"'")}:function(){var h=a.data(this,_);h?h.option(b||{})._init():a.data(this,_,new g(b,this))}),C}},a.Widget=function(){},a.Widget._childConstructors=[],a.Widget.prototype={widgetName:"widget",widgetEventPrefix:"",defaultElement:"<div>",options:{disabled:!1,create:null},_createWidget:function(h,v){v=a(v||this.defaultElement||this)[0],this.element=a(v),this.uuid=c++,this.eventNamespace="."+this.widgetName+this.uuid,this.options=a.widget.extend({},this.options,this._getCreateOptions(),h),this.bindings=a(),this.hoverable=a(),this.focusable=a(),v!==this&&(a.data(v,this.widgetFullName,this),this._on(!0,this.element,{remove:function(a){a.target===v&&this.destroy()}}),this.document=a(v.style?v.ownerDocument:v.document||v),this.window=a(this.document[0].defaultView||this.document[0].parentWindow)),this._create(),this._trigger("create",null,this._getCreateEventData()),this._init()},_getCreateOptions:a.noop,_getCreateEventData:a.noop,_create:a.noop,_init:a.noop,destroy:function(){this._destroy(),this.element.unbind(this.eventNamespace).removeData(this.widgetName).removeData(this.widgetFullName).removeData(a.camelCase(this.widgetFullName)),this.widget().unbind(this.eventNamespace).removeAttr("aria-disabled").removeClass(this.widgetFullName+"-disabled ui-state-disabled"),this.bindings.unbind(this.eventNamespace),this.hoverable.removeClass("ui-state-hover"),this.focusable.removeClass("ui-state-focus")},_destroy:a.noop,widget:function(){return this.element},option:function(c,v){var g,_,i,b=c;if(0===arguments.length)return a.widget.extend({},this.options);if("string"==typeof c)if(b={},g=c.split("."),c=g.shift(),g.length){for(_=b[c]=a.widget.extend({},this.options[c]),i=0;i<g.length-1;i++)_[g[i]]=_[g[i]]||{},_=_[g[i]];if(c=g.pop(),1===arguments.length)return _[c]===h?null:_[c];_[c]=v}else{if(1===arguments.length)return this.options[c]===h?null:this.options[c];b[c]=v}return this._setOptions(b),this},_setOptions:function(a){var h;for(h in a)this._setOption(h,a[h]);return this},_setOption:function(a,h){return this.options[a]=h,"disabled"===a&&(this.widget().toggleClass(this.widgetFullName+"-disabled ui-state-disabled",!!h).attr("aria-disabled",h),this.hoverable.removeClass("ui-state-hover"),this.focusable.removeClass("ui-state-focus")),this},enable:function(){return this._setOption("disabled",!1)},disable:function(){return this._setOption("disabled",!0)},_on:function(h,c,v){var g,_=this;"boolean"!=typeof h&&(v=c,c=h,h=!1),v?(c=g=a(c),this.bindings=this.bindings.add(c)):(v=c,c=this.element,g=this.widget()),a.each(v,function(v,b){function y(){return h||_.options.disabled!==!0&&!a(this).hasClass("ui-state-disabled")?("string"==typeof b?_[b]:b).apply(_,arguments):void 0}"string"!=typeof b&&(y.guid=b.guid=b.guid||y.guid||a.guid++);var w=v.match(/^(\w+)\s*(.*)$/),C=w[1]+_.eventNamespace,D=w[2];D?g.delegate(D,C,y):c.bind(C,y)})},_off:function(a,h){h=(h||"").split(" ").join(this.eventNamespace+" ")+this.eventNamespace,a.unbind(h).undelegate(h)},_delay:function(a,h){function c(){return("string"==typeof a?v[a]:a).apply(v,arguments)}var v=this;return setTimeout(c,h||0)},_hoverable:function(h){this.hoverable=this.hoverable.add(h),this._on(h,{mouseenter:function(h){a(h.currentTarget).addClass("ui-state-hover")},mouseleave:function(h){a(h.currentTarget).removeClass("ui-state-hover")}})},_focusable:function(h){this.focusable=this.focusable.add(h),this._on(h,{focusin:function(h){a(h.currentTarget).addClass("ui-state-focus")},focusout:function(h){a(h.currentTarget).removeClass("ui-state-focus")}})},_trigger:function(h,c,v){var g,_,b=this.options[h];if(v=v||{},c=a.Event(c),c.type=(h===this.widgetEventPrefix?h:this.widgetEventPrefix+h).toLowerCase(),c.target=this.element[0],_=c.originalEvent)for(g in _)g in c||(c[g]=_[g]);return this.element.trigger(c,v),!(a.isFunction(b)&&b.apply(this.element[0],[c].concat(v))===!1||c.isDefaultPrevented())}},a.each({show:"fadeIn",hide:"fadeOut"},function(h,c){a.Widget.prototype["_"+h]=function(v,g,_){"string"==typeof g&&(g={effect:g});var b,y=g?g===!0||"number"==typeof g?c:g.effect||c:h;g=g||{},"number"==typeof g&&(g={duration:g}),b=!a.isEmptyObject(g),g.complete=_,g.delay&&v.delay(g.delay),b&&a.effects&&a.effects.effect[y]?v[h](g):y!==h&&v[y]?v[y](g.duration,g.easing,_):v.queue(function(c){a(this)[h](),_&&_.call(v[0]),c()})}})}(jQuery),function(a){var h=!1;a(document).mouseup(function(){h=!1}),a.widget("ui.mouse",{version:"1.10.4",options:{cancel:"input,textarea,button,select,option",distance:1,delay:0},_mouseInit:function(){var h=this;this.element.bind("mousedown."+this.widgetName,function(a){return h._mouseDown(a)}).bind("click."+this.widgetName,function(c){return!0===a.data(c.target,h.widgetName+".preventClickEvent")?(a.removeData(c.target,h.widgetName+".preventClickEvent"),c.stopImmediatePropagation(),!1):void 0}),this.started=!1},_mouseDestroy:function(){this.element.unbind("."+this.widgetName),this._mouseMoveDelegate&&a(document).unbind("mousemove."+this.widgetName,this._mouseMoveDelegate).unbind("mouseup."+this.widgetName,this._mouseUpDelegate)},_mouseDown:function(c){if(!h){this._mouseStarted&&this._mouseUp(c),this._mouseDownEvent=c;var v=this,g=1===c.which,_="string"==typeof this.options.cancel&&c.target.nodeName?a(c.target).closest(this.options.cancel).length:!1;return g&&!_&&this._mouseCapture(c)?(this.mouseDelayMet=!this.options.delay,this.mouseDelayMet||(this._mouseDelayTimer=setTimeout(function(){v.mouseDelayMet=!0},this.options.delay)),this._mouseDistanceMet(c)&&this._mouseDelayMet(c)&&(this._mouseStarted=this._mouseStart(c)!==!1,!this._mouseStarted)?(c.preventDefault(),!0):(!0===a.data(c.target,this.widgetName+".preventClickEvent")&&a.removeData(c.target,this.widgetName+".preventClickEvent"),this._mouseMoveDelegate=function(a){return v._mouseMove(a)},this._mouseUpDelegate=function(a){return v._mouseUp(a)},a(document).bind("mousemove."+this.widgetName,this._mouseMoveDelegate).bind("mouseup."+this.widgetName,this._mouseUpDelegate),c.preventDefault(),h=!0,!0)):!0}},_mouseMove:function(h){return a.ui.ie&&(!document.documentMode||document.documentMode<9)&&!h.button?this._mouseUp(h):this._mouseStarted?(this._mouseDrag(h),h.preventDefault()):(this._mouseDistanceMet(h)&&this._mouseDelayMet(h)&&(this._mouseStarted=this._mouseStart(this._mouseDownEvent,h)!==!1,this._mouseStarted?this._mouseDrag(h):this._mouseUp(h)),!this._mouseStarted)},_mouseUp:function(h){return a(document).unbind("mousemove."+this.widgetName,this._mouseMoveDelegate).unbind("mouseup."+this.widgetName,this._mouseUpDelegate),this._mouseStarted&&(this._mouseStarted=!1,h.target===this._mouseDownEvent.target&&a.data(h.target,this.widgetName+".preventClickEvent",!0),this._mouseStop(h)),!1},_mouseDistanceMet:function(a){return Math.max(Math.abs(this._mouseDownEvent.pageX-a.pageX),Math.abs(this._mouseDownEvent.pageY-a.pageY))>=this.options.distance},_mouseDelayMet:function(){return this.mouseDelayMet},_mouseStart:function(){},_mouseDrag:function(){},_mouseStop:function(){},_mouseCapture:function(){return!0}})}(jQuery),function(a,h){function c(a,h,c){return[parseFloat(a[0])*(T.test(a[0])?h/100:1),parseFloat(a[1])*(T.test(a[1])?c/100:1)]}function v(h,c){return parseInt(a.css(h,c),10)||0}function g(h){var c=h[0];return 9===c.nodeType?{width:h.width(),height:h.height(),offset:{top:0,left:0}}:a.isWindow(c)?{width:h.width(),height:h.height(),offset:{top:h.scrollTop(),left:h.scrollLeft()}}:c.preventDefault?{width:0,height:0,offset:{top:c.pageY,left:c.pageX}}:{width:h.outerWidth(),height:h.outerHeight(),offset:h.offset()}}a.ui=a.ui||{};var _,b=Math.max,y=Math.abs,w=Math.round,C=/left|center|right/,D=/top|center|bottom/,E=/[\+\-]\d+(\.[\d]+)?%?/,N=/^\w+/,T=/%$/,k=a.fn.position;a.position={scrollbarWidth:function(){if(_!==h)return _;var c,v,g=a("<div style='display:block;position:absolute;width:50px;height:50px;overflow:hidden;'><div style='height:100px;width:auto;'></div></div>"),b=g.children()[0];return a("body").append(g),c=b.offsetWidth,g.css("overflow","scroll"),v=b.offsetWidth,c===v&&(v=g[0].clientWidth),g.remove(),_=c-v},getScrollInfo:function(h){var c=h.isWindow||h.isDocument?"":h.element.css("overflow-x"),v=h.isWindow||h.isDocument?"":h.element.css("overflow-y"),g="scroll"===c||"auto"===c&&h.width<h.element[0].scrollWidth,_="scroll"===v||"auto"===v&&h.height<h.element[0].scrollHeight;return{width:_?a.position.scrollbarWidth():0,height:g?a.position.scrollbarWidth():0}},getWithinInfo:function(h){var c=a(h||window),v=a.isWindow(c[0]),g=!!c[0]&&9===c[0].nodeType;return{element:c,isWindow:v,isDocument:g,offset:c.offset()||{left:0,top:0},scrollLeft:c.scrollLeft(),scrollTop:c.scrollTop(),width:v?c.width():c.outerWidth(),height:v?c.height():c.outerHeight()}}},a.fn.position=function(h){if(!h||!h.of)return k.apply(this,arguments);h=a.extend({},h);var _,T,M,A,W,P,I=a(h.of),S=a.position.getWithinInfo(h.within),H=a.position.getScrollInfo(S),L=(h.collision||"flip").split(" "),O={};return P=g(I),I[0].preventDefault&&(h.at="left top"),T=P.width,M=P.height,A=P.offset,W=a.extend({},A),a.each(["my","at"],function(){var a,c,v=(h[this]||"").split(" ");1===v.length&&(v=C.test(v[0])?v.concat(["center"]):D.test(v[0])?["center"].concat(v):["center","center"]),v[0]=C.test(v[0])?v[0]:"center",v[1]=D.test(v[1])?v[1]:"center",a=E.exec(v[0]),c=E.exec(v[1]),O[this]=[a?a[0]:0,c?c[0]:0],h[this]=[N.exec(v[0])[0],N.exec(v[1])[0]]}),1===L.length&&(L[1]=L[0]),"right"===h.at[0]?W.left+=T:"center"===h.at[0]&&(W.left+=T/2),"bottom"===h.at[1]?W.top+=M:"center"===h.at[1]&&(W.top+=M/2),_=c(O.at,T,M),W.left+=_[0],W.top+=_[1],this.each(function(){var g,C,D=a(this),E=D.outerWidth(),N=D.outerHeight(),k=v(this,"marginLeft"),P=v(this,"marginTop"),F=E+k+v(this,"marginRight")+H.width,U=N+P+v(this,"marginBottom")+H.height,R=a.extend({},W),j=c(O.my,D.outerWidth(),D.outerHeight());"right"===h.my[0]?R.left-=E:"center"===h.my[0]&&(R.left-=E/2),"bottom"===h.my[1]?R.top-=N:"center"===h.my[1]&&(R.top-=N/2),R.left+=j[0],R.top+=j[1],a.support.offsetFractions||(R.left=w(R.left),R.top=w(R.top)),g={marginLeft:k,marginTop:P},a.each(["left","top"],function(i,c){a.ui.position[L[i]]&&a.ui.position[L[i]][c](R,{targetWidth:T,targetHeight:M,elemWidth:E,elemHeight:N,collisionPosition:g,collisionWidth:F,collisionHeight:U,offset:[_[0]+j[0],_[1]+j[1]],my:h.my,at:h.at,within:S,elem:D})}),h.using&&(C=function(a){var c=A.left-R.left,v=c+T-E,g=A.top-R.top,_=g+M-N,w={target:{element:I,left:A.left,top:A.top,width:T,height:M},element:{element:D,left:R.left,top:R.top,width:E,height:N},horizontal:0>v?"left":c>0?"right":"center",vertical:0>_?"top":g>0?"bottom":"middle"};E>T&&y(c+v)<T&&(w.horizontal="center"),N>M&&y(g+_)<M&&(w.vertical="middle"),w.important=b(y(c),y(v))>b(y(g),y(_))?"horizontal":"vertical",h.using.call(this,a,w)}),D.offset(a.extend(R,{using:C}))})},a.ui.position={fit:{left:function(a,h){var c,v=h.within,g=v.isWindow?v.scrollLeft:v.offset.left,_=v.width,y=a.left-h.collisionPosition.marginLeft,w=g-y,C=y+h.collisionWidth-_-g;h.collisionWidth>_?w>0&&0>=C?(c=a.left+w+h.collisionWidth-_-g,a.left+=w-c):a.left=C>0&&0>=w?g:w>C?g+_-h.collisionWidth:g:w>0?a.left+=w:C>0?a.left-=C:a.left=b(a.left-y,a.left)},top:function(a,h){var c,v=h.within,g=v.isWindow?v.scrollTop:v.offset.top,_=h.within.height,y=a.top-h.collisionPosition.marginTop,w=g-y,C=y+h.collisionHeight-_-g;h.collisionHeight>_?w>0&&0>=C?(c=a.top+w+h.collisionHeight-_-g,a.top+=w-c):a.top=C>0&&0>=w?g:w>C?g+_-h.collisionHeight:g:w>0?a.top+=w:C>0?a.top-=C:a.top=b(a.top-y,a.top)}},flip:{left:function(a,h){var c,v,g=h.within,_=g.offset.left+g.scrollLeft,b=g.width,w=g.isWindow?g.scrollLeft:g.offset.left,C=a.left-h.collisionPosition.marginLeft,D=C-w,E=C+h.collisionWidth-b-w,N="left"===h.my[0]?-h.elemWidth:"right"===h.my[0]?h.elemWidth:0,T="left"===h.at[0]?h.targetWidth:"right"===h.at[0]?-h.targetWidth:0,k=-2*h.offset[0];0>D?(c=a.left+N+T+k+h.collisionWidth-b-_,(0>c||c<y(D))&&(a.left+=N+T+k)):E>0&&(v=a.left-h.collisionPosition.marginLeft+N+T+k-w,(v>0||y(v)<E)&&(a.left+=N+T+k))},top:function(a,h){var c,v,g=h.within,_=g.offset.top+g.scrollTop,b=g.height,w=g.isWindow?g.scrollTop:g.offset.top,C=a.top-h.collisionPosition.marginTop,D=C-w,E=C+h.collisionHeight-b-w,N="top"===h.my[1],T=N?-h.elemHeight:"bottom"===h.my[1]?h.elemHeight:0,k="top"===h.at[1]?h.targetHeight:"bottom"===h.at[1]?-h.targetHeight:0,M=-2*h.offset[1];0>D?(v=a.top+T+k+M+h.collisionHeight-b-_,a.top+T+k+M>D&&(0>v||v<y(D))&&(a.top+=T+k+M)):E>0&&(c=a.top-h.collisionPosition.marginTop+T+k+M-w,a.top+T+k+M>E&&(c>0||y(c)<E)&&(a.top+=T+k+M))}},flipfit:{left:function(){a.ui.position.flip.left.apply(this,arguments),a.ui.position.fit.left.apply(this,arguments)},top:function(){a.ui.position.flip.top.apply(this,arguments),a.ui.position.fit.top.apply(this,arguments)}}},function(){var h,c,v,g,i,_=document.getElementsByTagName("body")[0],b=document.createElement("div");h=document.createElement(_?"div":"body"),v={visibility:"hidden",width:0,height:0,border:0,margin:0,background:"none"},_&&a.extend(v,{position:"absolute",left:"-1000px",top:"-1000px"});for(i in v)h.style[i]=v[i];h.appendChild(b),c=_||document.documentElement,c.insertBefore(h,c.firstChild),b.style.cssText="position: absolute; left: 10.7432222px;",g=a(b).offset().left,a.support.offsetFractions=g>10&&11>g,h.innerHTML="",c.removeChild(h)}()}(jQuery),function(a){a.widget("ui.autocomplete",{version:"1.10.4",defaultElement:"<input>",options:{appendTo:null,autoFocus:!1,delay:300,minLength:1,position:{my:"left top",at:"left bottom",collision:"none"},source:null,change:null,close:null,focus:null,open:null,response:null,search:null,select:null},requestIndex:0,pending:0,_create:function(){var h,c,v,g=this.element[0].nodeName.toLowerCase(),_="textarea"===g,b="input"===g;this.isMultiLine=_?!0:b?!1:this.element.prop("isContentEditable"),this.valueMethod=this.element[_||b?"val":"text"],this.isNewMenu=!0,this.element.addClass("ui-autocomplete-input").attr("autocomplete","off"),this._on(this.element,{keydown:function(g){if(this.element.prop("readOnly"))return h=!0,v=!0,void(c=!0);h=!1,v=!1,c=!1;var _=a.ui.keyCode;switch(g.keyCode){case _.PAGE_UP:h=!0,this._move("previousPage",g);break;case _.PAGE_DOWN:h=!0,this._move("nextPage",g);break;case _.UP:h=!0,this._keyEvent("previous",g);break;case _.DOWN:h=!0,this._keyEvent("next",g);break;case _.ENTER:case _.NUMPAD_ENTER:this.menu.active&&(h=!0,g.preventDefault(),this.menu.select(g));break;case _.TAB:this.menu.active&&this.menu.select(g);break;case _.ESCAPE:this.menu.element.is(":visible")&&(this._value(this.term),this.close(g),g.preventDefault());break;default:c=!0,this._searchTimeout(g)}},keypress:function(v){if(h)return h=!1,void((!this.isMultiLine||this.menu.element.is(":visible"))&&v.preventDefault());if(!c){var g=a.ui.keyCode;switch(v.keyCode){case g.PAGE_UP:this._move("previousPage",v);break;case g.PAGE_DOWN:this._move("nextPage",v);break;case g.UP:this._keyEvent("previous",v);break;case g.DOWN:this._keyEvent("next",v)}}},input:function(a){return v?(v=!1,void a.preventDefault()):void this._searchTimeout(a)},focus:function(){this.selectedItem=null,this.previous=this._value()},blur:function(a){return this.cancelBlur?void delete this.cancelBlur:(clearTimeout(this.searching),this.close(a),void this._change(a))}}),this._initSource(),this.menu=a("<ul>").addClass("ui-autocomplete ui-front").appendTo(this._appendTo()).menu({role:null}).hide().data("ui-menu"),this._on(this.menu.element,{mousedown:function(h){h.preventDefault(),this.cancelBlur=!0,this._delay(function(){delete this.cancelBlur});var c=this.menu.element[0];a(h.target).closest(".ui-menu-item").length||this._delay(function(){var h=this;this.document.one("mousedown",function(v){v.target===h.element[0]||v.target===c||a.contains(c,v.target)||h.close()})})},menufocus:function(h,ui){if(this.isNewMenu&&(this.isNewMenu=!1,h.originalEvent&&/^mouse/.test(h.originalEvent.type)))return this.menu.blur(),void this.document.one("mousemove",function(){a(h.target).trigger(h.originalEvent)});var c=ui.item.data("ui-autocomplete-item");!1!==this._trigger("focus",h,{item:c})?h.originalEvent&&/^key/.test(h.originalEvent.type)&&this._value(c.value):this.liveRegion.text(c.value)},menuselect:function(a,ui){var h=ui.item.data("ui-autocomplete-item"),c=this.previous;this.element[0]!==this.document[0].activeElement&&(this.element.focus(),this.previous=c,this._delay(function(){this.previous=c,this.selectedItem=h})),!1!==this._trigger("select",a,{item:h})&&this._value(h.value),this.term=this._value(),this.close(a),this.selectedItem=h}}),this.liveRegion=a("<span>",{role:"status","aria-live":"polite"}).addClass("ui-helper-hidden-accessible").insertBefore(this.element),this._on(this.window,{beforeunload:function(){this.element.removeAttr("autocomplete")}})},_destroy:function(){clearTimeout(this.searching),this.element.removeClass("ui-autocomplete-input").removeAttr("autocomplete"),this.menu.element.remove(),this.liveRegion.remove()},_setOption:function(a,h){this._super(a,h),"source"===a&&this._initSource(),"appendTo"===a&&this.menu.element.appendTo(this._appendTo()),"disabled"===a&&h&&this.xhr&&this.xhr.abort()},_appendTo:function(){var h=this.options.appendTo;return h&&(h=h.jquery||h.nodeType?a(h):this.document.find(h).eq(0)),h||(h=this.element.closest(".ui-front")),h.length||(h=this.document[0].body),h},_initSource:function(){var h,c,v=this;a.isArray(this.options.source)?(h=this.options.source,this.source=function(c,v){v(a.ui.autocomplete.filter(h,c.term))}):"string"==typeof this.options.source?(c=this.options.source,this.source=function(h,g){v.xhr&&v.xhr.abort(),v.xhr=a.lgAjax({url:c,data:h,dataType:"json",success:function(a){g(a)},error:function(){g([])}})}):this.source=this.options.source},_searchTimeout:function(a){clearTimeout(this.searching),this.searching=this._delay(function(){this.term!==this._value()&&(this.selectedItem=null,this.search(null,a))},this.options.delay)},search:function(a,h){return a=null!=a?a:this._value(),this.term=this._value(),a.length<this.options.minLength?this.close(h):this._trigger("search",h)!==!1?this._search(a):void 0},_search:function(a){this.pending++,this.element.addClass("ui-autocomplete-loading"),this.cancelSearch=!1,this.source({term:a},this._response())},_response:function(){var h=++this.requestIndex;return a.proxy(function(a){h===this.requestIndex&&this.__response(a),this.pending--,this.pending||this.element.removeClass("ui-autocomplete-loading")},this)},__response:function(a){a&&(a=this._normalize(a)),this._trigger("response",null,{content:a}),!this.options.disabled&&a&&a.length&&!this.cancelSearch?(this._suggest(a),this._trigger("open")):this._close()},close:function(a){this.cancelSearch=!0,this._close(a)},_close:function(a){this.menu.element.is(":visible")&&(this.menu.element.hide(),this.menu.blur(),this.isNewMenu=!0,this._trigger("close",a))},_change:function(a){this.previous!==this._value()&&this._trigger("change",a,{item:this.selectedItem})},_normalize:function(h){return h.length&&h[0].label&&h[0].value?h:a.map(h,function(h){return"string"==typeof h?{label:h,value:h}:a.extend({label:h.label||h.value,value:h.value||h.label},h)})},_suggest:function(h){var ul=this.menu.element.empty();this._renderMenu(ul,h),this.isNewMenu=!0,this.menu.refresh(),ul.show(),this._resizeMenu(),ul.position(a.extend({of:this.element},this.options.position)),this.options.autoFocus&&this.menu.next()},_resizeMenu:function(){var ul=this.menu.element;ul.outerWidth(Math.max(ul.width("").outerWidth()+1,this.element.outerWidth()))},_renderMenu:function(ul,h){var c=this;a.each(h,function(a,h){c._renderItemData(ul,h)})},_renderItemData:function(ul,a){return this._renderItem(ul,a).data("ui-autocomplete-item",a)},_renderItem:function(ul,h){return a("<li>").append(a("<a>").text(h.label)).appendTo(ul)},_move:function(a,h){return this.menu.element.is(":visible")?this.menu.isFirstItem()&&/^previous/.test(a)||this.menu.isLastItem()&&/^next/.test(a)?(this._value(this.term),void this.menu.blur()):void this.menu[a](h):void this.search(null,h)},widget:function(){return this.menu.element},_value:function(){return this.valueMethod.apply(this.element,arguments)},_keyEvent:function(a,h){(!this.isMultiLine||this.menu.element.is(":visible"))&&(this._move(a,h),h.preventDefault())}}),a.extend(a.ui.autocomplete,{escapeRegex:function(a){return a.replace(/[\-\[\]{}()*+?.,\\\^$|#\s]/g,"\\$&")},filter:function(h,c){var v=new RegExp(a.ui.autocomplete.escapeRegex(c),"i");return a.grep(h,function(a){return v.test(a.label||a.value||a)})}}),a.widget("ui.autocomplete",a.ui.autocomplete,{options:{messages:{noResults:"No search results.",results:function(a){return a+(a>1?" results are":" result is")+" available, use up and down arrow keys to navigate."}}},__response:function(a){var h;this._superApply(arguments),this.options.disabled||this.cancelSearch||(h=a&&a.length?this.options.messages.results(a.length):this.options.messages.noResults,this.liveRegion.text(h))}})}(jQuery),function(a){a.widget("ui.menu",{version:"1.10.4",defaultElement:"<ul>",delay:300,options:{icons:{submenu:"ui-icon-carat-1-e"},menus:"ul",position:{my:"left top",at:"right top"},role:"menu",blur:null,focus:null,select:null},_create:function(){this.activeMenu=this.element,this.mouseHandled=!1,this.element.uniqueId().addClass("ui-menu ui-widget ui-widget-content ui-corner-all").toggleClass("ui-menu-icons",!!this.element.find(".ui-icon").length).attr({role:this.options.role,tabIndex:0}).bind("click"+this.eventNamespace,a.proxy(function(a){this.options.disabled&&a.preventDefault()},this)),this.options.disabled&&this.element.addClass("ui-state-disabled").attr("aria-disabled","true"),this._on({"mousedown .ui-menu-item > a":function(a){a.preventDefault()},"click .ui-state-disabled > a":function(a){a.preventDefault()},"click .ui-menu-item:has(a)":function(h){var c=a(h.target).closest(".ui-menu-item");!this.mouseHandled&&c.not(".ui-state-disabled").length&&(this.select(h),h.isPropagationStopped()||(this.mouseHandled=!0),c.has(".ui-menu").length?this.expand(h):!this.element.is(":focus")&&a(this.document[0].activeElement).closest(".ui-menu").length&&(this.element.trigger("focus",[!0]),this.active&&1===this.active.parents(".ui-menu").length&&clearTimeout(this.timer)))},"mouseenter .ui-menu-item":function(h){var c=a(h.currentTarget);c.siblings().children(".ui-state-active").removeClass("ui-state-active"),this.focus(h,c)},mouseleave:"collapseAll","mouseleave .ui-menu":"collapseAll",focus:function(a,h){var c=this.active||this.element.children(".ui-menu-item").eq(0);h||this.focus(a,c)},blur:function(h){this._delay(function(){a.contains(this.element[0],this.document[0].activeElement)||this.collapseAll(h)})},keydown:"_keydown"}),this.refresh(),this._on(this.document,{click:function(h){a(h.target).closest(".ui-menu").length||this.collapseAll(h),this.mouseHandled=!1}})},_destroy:function(){this.element.removeAttr("aria-activedescendant").find(".ui-menu").addBack().removeClass("ui-menu ui-widget ui-widget-content ui-corner-all ui-menu-icons").removeAttr("role").removeAttr("tabIndex").removeAttr("aria-labelledby").removeAttr("aria-expanded").removeAttr("aria-hidden").removeAttr("aria-disabled").removeUniqueId().show(),this.element.find(".ui-menu-item").removeClass("ui-menu-item").removeAttr("role").removeAttr("aria-disabled").children("a").removeUniqueId().removeClass("ui-corner-all ui-state-hover").removeAttr("tabIndex").removeAttr("role").removeAttr("aria-haspopup").children().each(function(){var h=a(this);h.data("ui-menu-submenu-carat")&&h.remove()}),this.element.find(".ui-menu-divider").removeClass("ui-menu-divider ui-widget-content")},_keydown:function(h){function c(a){return a.replace(/[\-\[\]{}()*+?.,\\\^$|#\s]/g,"\\$&")}var v,g,_,b,y,w=!0;switch(h.keyCode){case a.ui.keyCode.PAGE_UP:this.previousPage(h);break;case a.ui.keyCode.PAGE_DOWN:this.nextPage(h);break;case a.ui.keyCode.HOME:this._move("first","first",h);break;case a.ui.keyCode.END:this._move("last","last",h);break;case a.ui.keyCode.UP:this.previous(h);break;case a.ui.keyCode.DOWN:this.next(h);break;case a.ui.keyCode.LEFT:this.collapse(h);break;case a.ui.keyCode.RIGHT:this.active&&!this.active.is(".ui-state-disabled")&&this.expand(h);break;case a.ui.keyCode.ENTER:case a.ui.keyCode.SPACE:this._activate(h);break;case a.ui.keyCode.ESCAPE:this.collapse(h);break;default:w=!1,g=this.previousFilter||"",_=String.fromCharCode(h.keyCode),b=!1,clearTimeout(this.filterTimer),_===g?b=!0:_=g+_,y=new RegExp("^"+c(_),"i"),v=this.activeMenu.children(".ui-menu-item").filter(function(){return y.test(a(this).children("a").text())}),v=b&&-1!==v.index(this.active.next())?this.active.nextAll(".ui-menu-item"):v,v.length||(_=String.fromCharCode(h.keyCode),y=new RegExp("^"+c(_),"i"),v=this.activeMenu.children(".ui-menu-item").filter(function(){return y.test(a(this).children("a").text())})),v.length?(this.focus(h,v),v.length>1?(this.previousFilter=_,this.filterTimer=this._delay(function(){delete this.previousFilter},1e3)):delete this.previousFilter):delete this.previousFilter}w&&h.preventDefault()},_activate:function(a){this.active.is(".ui-state-disabled")||(this.active.children("a[aria-haspopup='true']").length?this.expand(a):this.select(a))},refresh:function(){var h,c=this.options.icons.submenu,v=this.element.find(this.options.menus);this.element.toggleClass("ui-menu-icons",!!this.element.find(".ui-icon").length),v.filter(":not(.ui-menu)").addClass("ui-menu ui-widget ui-widget-content ui-corner-all").hide().attr({role:this.options.role,"aria-hidden":"true","aria-expanded":"false"}).each(function(){var h=a(this),v=h.prev("a"),g=a("<span>").addClass("ui-menu-icon ui-icon "+c).data("ui-menu-submenu-carat",!0);v.attr("aria-haspopup","true").prepend(g),h.attr("aria-labelledby",v.attr("id"))}),h=v.add(this.element),h.children(":not(.ui-menu-item):has(a)").addClass("ui-menu-item").attr("role","presentation").children("a").uniqueId().addClass("ui-corner-all").attr({tabIndex:-1,role:this._itemRole()}),h.children(":not(.ui-menu-item)").each(function(){var h=a(this);
/[^\-\u2014\u2013\s]/.test(h.text())||h.addClass("ui-widget-content ui-menu-divider")}),h.children(".ui-state-disabled").attr("aria-disabled","true"),this.active&&!a.contains(this.element[0],this.active[0])&&this.blur()},_itemRole:function(){return{menu:"menuitem",listbox:"option"}[this.options.role]},_setOption:function(a,h){"icons"===a&&this.element.find(".ui-menu-icon").removeClass(this.options.icons.submenu).addClass(h.submenu),this._super(a,h)},focus:function(a,h){var c,v;this.blur(a,a&&"focus"===a.type),this._scrollIntoView(h),this.active=h.first(),v=this.active.children("a").addClass("ui-state-focus"),this.options.role&&this.element.attr("aria-activedescendant",v.attr("id")),this.active.parent().closest(".ui-menu-item").children("a:first").addClass("ui-state-active"),a&&"keydown"===a.type?this._close():this.timer=this._delay(function(){this._close()},this.delay),c=h.children(".ui-menu"),c.length&&a&&/^mouse/.test(a.type)&&this._startOpening(c),this.activeMenu=h.parent(),this._trigger("focus",a,{item:h})},_scrollIntoView:function(h){var c,v,g,_,b,y;this._hasScroll()&&(c=parseFloat(a.css(this.activeMenu[0],"borderTopWidth"))||0,v=parseFloat(a.css(this.activeMenu[0],"paddingTop"))||0,g=h.offset().top-this.activeMenu.offset().top-c-v,_=this.activeMenu.scrollTop(),b=this.activeMenu.height(),y=h.height(),0>g?this.activeMenu.scrollTop(_+g):g+y>b&&this.activeMenu.scrollTop(_+g-b+y))},blur:function(a,h){h||clearTimeout(this.timer),this.active&&(this.active.children("a").removeClass("ui-state-focus"),this.active=null,this._trigger("blur",a,{item:this.active}))},_startOpening:function(a){clearTimeout(this.timer),"true"===a.attr("aria-hidden")&&(this.timer=this._delay(function(){this._close(),this._open(a)},this.delay))},_open:function(h){var c=a.extend({of:this.active},this.options.position);clearTimeout(this.timer),this.element.find(".ui-menu").not(h.parents(".ui-menu")).hide().attr("aria-hidden","true"),h.show().removeAttr("aria-hidden").attr("aria-expanded","true").position(c)},collapseAll:function(h,c){clearTimeout(this.timer),this.timer=this._delay(function(){var v=c?this.element:a(h&&h.target).closest(this.element.find(".ui-menu"));v.length||(v=this.element),this._close(v),this.blur(h),this.activeMenu=v},this.delay)},_close:function(a){a||(a=this.active?this.active.parent():this.element),a.find(".ui-menu").hide().attr("aria-hidden","true").attr("aria-expanded","false").end().find("a.ui-state-active").removeClass("ui-state-active")},collapse:function(a){var h=this.active&&this.active.parent().closest(".ui-menu-item",this.element);h&&h.length&&(this._close(),this.focus(a,h))},expand:function(a){var h=this.active&&this.active.children(".ui-menu ").children(".ui-menu-item").first();h&&h.length&&(this._open(h.parent()),this._delay(function(){this.focus(a,h)}))},next:function(a){this._move("next","first",a)},previous:function(a){this._move("prev","last",a)},isFirstItem:function(){return this.active&&!this.active.prevAll(".ui-menu-item").length},isLastItem:function(){return this.active&&!this.active.nextAll(".ui-menu-item").length},_move:function(a,h,c){var v;this.active&&(v="first"===a||"last"===a?this.active["first"===a?"prevAll":"nextAll"](".ui-menu-item").eq(-1):this.active[a+"All"](".ui-menu-item").eq(0)),v&&v.length&&this.active||(v=this.activeMenu.children(".ui-menu-item")[h]()),this.focus(c,v)},nextPage:function(h){var c,v,g;return this.active?void(this.isLastItem()||(this._hasScroll()?(v=this.active.offset().top,g=this.element.height(),this.active.nextAll(".ui-menu-item").each(function(){return c=a(this),c.offset().top-v-g<0}),this.focus(h,c)):this.focus(h,this.activeMenu.children(".ui-menu-item")[this.active?"last":"first"]()))):void this.next(h)},previousPage:function(h){var c,v,g;return this.active?void(this.isFirstItem()||(this._hasScroll()?(v=this.active.offset().top,g=this.element.height(),this.active.prevAll(".ui-menu-item").each(function(){return c=a(this),c.offset().top-v+g>0}),this.focus(h,c)):this.focus(h,this.activeMenu.children(".ui-menu-item").first()))):void this.next(h)},_hasScroll:function(){return this.element.outerHeight()<this.element.prop("scrollHeight")},select:function(h){this.active=this.active||a(h.target).closest(".ui-menu-item");var ui={item:this.active};this.active.has(".ui-menu").length||this.collapseAll(h,!0),this._trigger("select",h,ui)}})}(jQuery)});
/*!search-result/modules/common/js/config.js*/
;define("search-result/modules/common/js/config",["require","exports","module"],function(require,exports,module){module.exports={url:{positonlist:GLOBAL_DOMAIN.ctx+"/jobs/positionAjax.json",companylist:GLOBAL_DOMAIN.ctx+"/jobs/companyAjax.json",loginhistory:GLOBAL_DOMAIN.ctx+"/jobs/recentView.json",relatedsearch:window.location.protocol+"//relsearch.lagou.com/relquery",inputSuggest:window.location.protocol+"//suggest.lagou.com/suggestion/mix",switchCity:GLOBAL_DOMAIN.ctx+"/user/saveCity.json",allCity:GLOBAL_DOMAIN.ctx+"/lbs/getAllCitySearchLabels.json"}}});
/*!search-result/modules/search-bar/main.js*/
;define("search-result/modules/search-bar/main",["require","exports","module","search-result/modules/common/js/config","common/widgets/plat/exposure"],function(require){function a(){var a=872-$(".current-handle-position").width(),c=$(".current-handle-position").width();$(".city-wrapper").css("margin-left",c+"px"),$(".city-wrapper").width(a),$(".city-wrapper").css("overflow","hidden"),$(".city-wrapper").show()}function c(a){a==v?(_.hide(),w.hide(),O.show(),j.val(!0)):a==b&&(_.show(),w.show(),O.hide(),j.val(!1))}function h(a){var c,h=encodeURIComponent(document.URL),g=[];"jids"==a?(c=$("#s_position_list .con_list_item"),c.each(function(){var a=$(this).attr("data-positionid");g.push(a)})):(c=$("#company_list .c_list_item"),c.each(function(){var a=$(this).attr("data-companyid");g.push(a)}));var b=g.join(","),v=Math.random(),y=b,t="search",j={t:t,dl:h,z:v};"jids"==a?j.jids=y:j.cids=y,I(j)}var g=require("search-result/modules/common/js/config"),b="position",v="company",y=$("#searchBar"),j=$("#searchBarCl"),_=$("#positionHead"),w=$("#s_position_list"),O=$("#company_list");$("#tab_pos").on("click",function(){var g=$(this);g.hasClass("active")||g.hasClass("disabled")||(g.addClass("active").next().removeClass("active"),c(b),a(),h("jids"))}),$("#tab_comp").on("click",function(){var a=$(this);a.hasClass("active")||a.hasClass("disabled")||(a.addClass("active").prev().removeClass("active"),c(v),h("cids"))});var C=(y.find("form"),$("#keyword"));$.widget("custom.catcomplete",$.ui.autocomplete,{_renderItem:function(ul,a){var c=a.hotness>=450?"大于":"共";return $("<li></li>").data("item.autocomplete",a).append("<a><span class='fl'>"+a.cont+"</span><span class='fr'>"+c+"<i>"+(a.hotness>=450?450:a.hotness)+"个</i>职位</span></a>").appendTo(ul)},_renderMenu:function(ul,a){function c(a,c){ul.append("<li class='ui-autocomplete-category'>"+a+"</li>");for(var i=0,l=c.length;l>i;i++)h._renderItemData(ul,c[i])}var h=this;a=a[0],a.POSITION&&a.POSITION.length&&c("职位",a.POSITION),a.COMPANY&&a.COMPANY.length&&c("公司",a.COMPANY),ul.find(".ui-autocomplete-category:not(:first-child)").next().css("borderTop","1px dashed #e5e5e5"),ul.find(".ui-autocomplete-category").first().css("borderTop","none")}});C.catcomplete({minLength:0,source:function(a,c){""!=$.trim(a.term)?$.lgAjax({url:g.url.inputSuggest,dataType:"jsonp",jsonp:"suggestback",data:{input:a.term,type:1,num:10},success:function(a){if(a)if(a.POSITION&&a.POSITION.length||a.COMPANY&&a.COMPANY.length){var h=[];h.push(a),c(h)}else c("");else c("")}}):c("")},focus:function(){return!1},select:function(a,ui){return global.searchTj.suginput=C.val(),C.val(ui.item.cont),global.searchTj.labelWords="sug",$("#submit").trigger("click"),!1}}),$("#submit").on("click",function(){var a=C.val(),c=/[\\\/]/g;if(a=a.replace(c," "),""!=global.queryParam.city){var h="city="+global.queryParam.city;""!=global.queryParam.district&&(h+="&district="+global.queryParam.district,""!=global.queryParam.bizArea&&(h+="&bizArea="+global.queryParam.bizArea))}else var h="city=全国";h+="&cl="+global.searchTj.cl+"&fromSearch="+global.searchTj.fromSearch+"&labelWords="+global.searchTj.labelWords+"&suginput="+global.searchTj.suginput,"1"==global.isSchoolJob&&(h+="&isSchoolJob=1"),a=a.replace(/.html$/," html").replace(/.jsp$/," jsp"),a=encodeURIComponent(a),$.lgAjax({url:GLOBAL_DOMAIN.ctx+"/jobs/list_"+a,type:"get",data:h}).done(function(){window.location.href=GLOBAL_DOMAIN.ctx+"/jobs/list_"+a+"?"+h}).fail(function(){console.log("error")}),$("#submit").attr("disabled",!1)}),$("#search_input").on("keyup",function(){this.value.length>64&&(this.value=this.value.substring(0,64))}),$("#keyword").on("keyup",function(e){return 13==e.keyCode?($("#submit").trigger("click"),!1):void 0});var I=require("common/widgets/plat/exposure").postoA});
/*!search-result/modules/switch-city/main.js*/
;define("search-result/modules/switch-city/main",["require","exports","module","search-result/modules/common/js/config"],function(require){function c(){var c=this,h=1,y=global.subSite;"closeText"==this.className?h=0:"tabs"==this.className&&(y=global.current_city),global.isLogin?$.get(a.url.switchCity,{city:y,isCloseNotice:h},function(a){"object"!=typeof a&&(a=JSON.parse(a)),1!=a.state?alert(a.message):"tabs"==c.className&&(location.href=location.href)}):($.cookie("index_location_city",y,{expires:30,domain:"lagou.com",path:"/"}),h||$.cookie("isCloseNotice",h,{expires:30,domain:"lagou.com",path:"/"}),"tabs"==this.className&&(location.href=location.href)),global.subSite=y,$("#switchCity").hide()}var a=require("search-result/modules/common/js/config");document.getElementById("switchCity")&&(global.isLogin?1==global.isCloseNotice&&($("#switchCity").show(),$("#switchCity .closeText").add("#switchCity .closeBtn").add("#switchCity .tabs").one("click",c)):$.cookie("isCloseNotice")||0==$.cookie("isCloseNotice")||($("#switchCity").show(),$("#switchCity .closeText").add("#switchCity .closeBtn").add("#switchCity .tabs").one("click",c)))});
/*!common/components/util/emitter.js*/
;define("common/components/util/emitter",["require"],function(){function a(){}var h=a.prototype;return h._getEvents=function(){return this._events||(this._events={}),this._events},h._getMaxListeners=function(){return isNaN(this.maxListeners)&&(this.maxListeners=10),this.maxListeners},h.on=function(a,h){var c=this._getEvents(),v=this._getMaxListeners();c[a]=c[a]||[];var g=c[a].length;if(g>=v&&0!==v)throw new RangeError("Warning: possible Emitter memory leak detected. "+g+" listeners added.");return c[a].push(h),this},h.once=function(a,h){function c(){v.off(a,c),h.apply(this,arguments)}var v=this;return c.listener=h,this.on(a,c),this},h.off=function(a,h){var c=this._getEvents();if(0===arguments.length)return this._events={},this;var v=c[a];if(!v)return this;if(1===arguments.length)return delete c[a],this;for(var g,i=0;i<v.length;i++)if(g=v[i],g===h||g.listener===h){v.splice(i,1);break}return this},h.emit=function(a){var h=this._getEvents(),c=h[a],v=Array.prototype.slice.call(arguments,1);if(c){c=c.slice(0);for(var i=0,g=c.length;g>i;i++)c[i].apply(this,v)}return this},h.listeners=function(a){var h=this._getEvents();return h[a]||[]},h.setMaxListeners=function(a){return this.maxListeners=a,this},a.mixin=function(h){for(var c in a.prototype)h[c]=a.prototype[c];return h},a});
/*!common/components/base/Abstract.js*/
;define("common/components/base/Abstract",["require","exports","module"],function(require,exports,module){var c=0,a=function(a){for(var h in a)this[h]=a[h];c++};a.prototype={constructor:a,init:function(){var a=this;if(!a._nocontainer_&&!a.container)throw a.TAG+" need container!";return a._id_=c,a},getInnerId:function(){var c=this;return c._id_},show:function(){var c=this;return c.container&&c.container.show(),c},hide:function(){var c=this;return c.container&&c.container.hide(),c},on:function(){var c=this;return c.container.on.apply(c.container,arguments),c},hover:function(c,a,h){var v=this;return v.container.find(c).hover(a,h),v}},module.exports=a});
/*!common/components/util/sets.js*/
;define("common/components/util/sets",["require","exports","module"],function(require,exports,module){var a=function(a){return a.replace(/([\.\?\+\*\^\(\)\\\{\}\$\/])/g,"\\$1")};module.exports={placeholderable:function(a,c){function h(){C.removeClass("edui-container-focus"),$.trim(a.getContentTxt())||a.setContent(w)}function g(){C.addClass("edui-container-focus"),~$.trim(a.getContent()).indexOf(y)&&a.setContent("")}var y="zns6GSI672389sdnxzcxxz",v=["font-size:14px;","color:#a9a9a9;","padding-left:5px;"].join(""),w=['<span data-tag="'+y+'" style="'+v+'">',c,"</span>"].join(""),C=$(a.container);a.addListener("focus",g),a.addListener("blur",h),window.setTimeout(function(){h(a)},0)},trimRegExp:a,imgupcut:function(a,c,h,g){a=$(a);var y=a.attr("id"),v=a.attr("title"),w="text",C={};this.AllowExt=".jpg,.gif,.jpeg,.png,.pjpeg",this.FileExt=a.val().substr(a.val().lastIndexOf(".")).toLowerCase(),0!=this.AllowExt&&-1==this.AllowExt.indexOf(this.FileExt)?(g&&g("typeerror",y,v),$("input[type = 'file']").val("")):$.ajaxFileUpload({url:c,secureuri:!1,fileElementId:y,data:C,dataType:w,success:function(a){"text"==w&&(a=$.parseJSON(a)),a.success?h&&h(a.content,y):g&&g("responseerror",y,a)},error:function(a){g&&g("servererror",y,a)}})},highlights:function(c,h){"string"==typeof h&&(h=[h]),$(c).each(function(){var c=$(this),g=c.html();$.each(h,function(h,y){if(""!=y){y=a(y.toLowerCase());var v=new RegExp("("+y+")","gi");v.test(g)&&c.html(c.html().replace(v,'<em class="hl">$1</em>'))}})})},inherit:function(a,c,h){a.prototype=$.extend(new c,h),a.prototype.constructor=a,a.prototype.supertoucher=function(){var a=new c;return function(c,h,g){c&&(h||(h=[]),a[c]&&a[c].apply(g||this,h))}}()},inWeixin:function(){var a=navigator.userAgent.toLowerCase();return"micromessenger"==a.match(/MicroMessenger/i)?!0:!1},throttle:function(a,c,h,g){h=void 0==h?null:h,a.tId&&clearTimeout(a.tId),a.tId=setTimeout(function(){a.apply(h,c)},g?g:140)},isSet:function(a){return!!a&&"null"!=a&&"undefined"!=a},reflow:function(){window.setTimeout(function(){document.body.style.display="none",document.body.offsetHeight,document.body.style.display=""},0)},random:function(a){return a+Math.floor(1e5*Math.random())}}});
/*!common/components/pager/main.js*/
;define("common/components/pager/main",["require","exports","module","common/components/base/Abstract","common/components/util/sets","dep/artTemplate/dist/template"],function(require,exports,module){var a=require("common/components/base/Abstract"),c=require("common/components/util/sets"),g=require("dep/artTemplate/dist/template"),_={aIsCurTpl:'<span hidefocus="hidefocus" page="{{index}}" class="pager_is_current">\n    {{index}}\n</span>',aNotCurTpl:'<span hidefocus="hidefocus" page="{{index}}" class="pager_not_current">\n    {{index}}\n</span>'},h=2,v="pager_container",b="pager_is_current",T="pager_prev",A="pager_prev_disabled",C="pager_next",L="pager_next_disabled",k="pager_lgthen",F="pager_lgthen_dis",N="上一页",w="下一页",E=g.compile(_.aNotCurTpl),I=g.compile(_.aIsCurTpl),G="···",M=function(c){a.call(this,c)};c.inherit(M,a,{TAG:"PagerConstructor",init:function(){var a=this;return a.supertoucher("init",null,a),a.neighbour=void 0==a.neighbour||h,a._render(),a._bindEvents(),a},_isFirst:function(){var a=this;return 1==a.current},_isLast:function(){var a=this;return a.current==a.totalpage},_render:function(){var a=this,c="";if(1==a.totalpage)return a._clear(),!1;if(a.totalpage<=10)for(var i=1;i<a.totalpage+1;i++){var g=i==a.current?I:E;c+=g({index:i})}else if(a.totalpage>10){for(var i=1;i<a.totalpage+1;i++){var g=i==a.current?I:E;c+=Math.abs(i-a.current)<=h||1==i||i==a.totalpage?g({index:i}):G}c=c.replace(/[·]+/g,G)}var t='<div class="'+v+'"><span hidefocus="hidefocus" action="prev" class="'+T+" "+(a._isFirst()?A:"")+'"><strong class="'+k+" "+(a._isFirst()?F:"")+'"></strong>'+(a.pre||N)+"</span>"+c+'<span hidefocus="hidefocus" action="next" class="'+C+" "+(a._isLast()?L:"")+'">'+(a.nex||w)+'<strong class="'+k+" "+(a._isLast()?F:"")+'"></strong></span></div>';a.container.html(t)},_clear:function(){var a=this;a.container.html("")},_bindEvents:function(){var a=this;a.container.on("click",function(e){var c=e.target;if(!$(c).hasClass(b)){var g;if("span"==c.tagName.toLowerCase()&&(c.getAttribute("page")||c.getAttribute("action")))if(g=c.getAttribute("action"))switch(g){case"prev":if(a._isFirst())break;var _=+a.current-1;a.set(_),a.emitter.emit("pager:go",_);break;case"next":if(a._isLast())break;var _=+a.current+1;a.set(_),a.emitter.emit("pager:go",_)}else{var _=c.getAttribute("page");a.set(_),a.emitter.emit("pager:go",_)}}})},set:function(a){var c=this;a>c.totalpage&&(a=c.totalpage),c.current=+a,c._render()},setTotal:function(a){var c=this;c.totalpage=+a,c.set(1)},get:function(){var a=this;return+a.current}}),module.exports=M});
/*!common/components/list-base/main.js*/
;define("common/components/list-base/main",["require","exports","module","common/components/base/Abstract","common/components/util/sets","dep/artTemplate/dist/template"],function(require,exports,module){var a=require("common/components/base/Abstract"),c=require("common/components/util/sets"),h=require("dep/artTemplate/dist/template"),y={more:'<li class="activeable list-more">\n    加载更多\n</li>',empty:'<li class="list-empty">\n    <span class="icon"></span>\n    <span class="text">当前没有符合条件的职位</span>\n</li>'},v=function(c){a.call(this,c)};c.inherit(v,a,{TAG:"ListBaseConstructor",init:function(a){var c=this;return c.showCount=c.showCount||5,c.supertoucher("init",null,c),c.key||(c.key=function(a){return a}),a?(c.sets(),c.data&&c.data.length&&c.render(),c.bindEvents()):c.sets().render().bindEvents(),c},sets:function(){var a=this;a.listOffset=0,a.pen=h.compile(0==a.layout.indexOf("#")?$.trim($(a.layout).html()):a.layout);try{a.totalpage=Math.ceil(a.total/a.pagesize)}catch(e){}return a.handleMoreEmpty(),a},handleMoreEmpty:function(){var a=this;return y.more=function(){return void 0==a.layoutmore?y.more:a.layoutmore&&0==a.layoutmore.indexOf("#")?$.trim($(a.layoutmore).html()):a.layoutmore}(),a.more=$(y.more),y.empty=function(){return void 0==a.layoutempty?y.empty:a.layoutempty&&0==a.layoutempty.indexOf("#")?$.trim($(a.layoutempty).html()):a.layoutempty}(),a},render:function(){var a=this;return a.data&&a.data.length?a.refresh():a.handleEmpty(),a},append:function(){var a=this;a.more.remove(),a.moreappened=!1;try{a.totalpage=Math.ceil(a.total/a.pagesize)}catch(e){}return a.container.append(a.pen({data:a.adata,indexOffset:a.listOffset,extra:a.extra})),a.data=a.data.concat(a.adata),a.handleMore().handleEmpty(),a.show(),a.listOffset+=a.adata.length,a},refresh:function(){var a=this;a.listOffset=0,a.more.remove(),a.moreappened=!1;try{a.totalpage=Math.ceil(a.total/a.pagesize)}catch(e){}return a.container.hide(),a.container.html(a.pen({data:a.data,indexOffset:a.listOffset,extra:a.extra})),a.showMoreTip&&1==a.showMoreTip&&a.container.find(".item_ul_li:nth-child(n+"+(a.showCount+1)+")").addClass("none"),a.container.show(),a.handleMore().handleEmpty(),a.show(),a.listOffset=a.data.length,a},handleEmpty:function(){var a=this;if(!a.noempty)return a.data.length||(a.container.html(y.empty),a.emitter.emit("listbase:empty")),a},handleMore:function(){var a=this;return!a.nomore&&a.totalpage&&a.curpage?(a.layoutmore||a.more.text("加载更多"),a.pending=!1,a.data.length?0==a.showMoreTip?(a.moreappened&&a.more.hide(),a):a.totalpage!=a.curpage||1==a.totalpage&&a.data.length>a.showCount?(a.moreappened&&a.more.show(),a.moreappened||(a.container.append(a.more),a.moreappened=!0),a):(a.moreappened&&a.more.hide(),a):(a.moreappened&&a.more.hide(),a.handleEmpty(),a)):a},bindEvents:function(){var a=this;return a.container.on("click",".item",function(e){var c=$(this);a.emitter.emit("listbase:itemclick",a.data[c.data("index")],c,e)}),a.container.on("click",".list-more",function(){$(this);a.pending||(a.pending=!0,a.more.text("加载中..."),a.emitter.emit("listbase:moreclick"))}),a.container.on("click",".more_button",function(){var c=$(this);a.pending||(a.pending=!0,c.text("加载中..."),a.emitter.emit("listbase:moreclick"))}),a},select:function(a){var c=this;c.lis||(c.lis=c.container.find(".item")),c.lis.removeClass("selected");var h;return $.each(c.data,function(y,v){return c.key(v)==a?(h=y,!1):void 0}),$(c.lis[h]).addClass("selected"),c}}),module.exports=v});
/*!common/widgets/plat/addIcon.js*/
;define("common/widgets/plat/addIcon",["require","exports","module"],function(require,exports){var a=(window.GLOBAL_DOMAIN.acctx||window.location.protocol+"//activity.lagou.com")+"/activityapi/icon/getIcon.json",c=window.GLOBAL_DOMAIN.lgsctx+"/";exports.loadIconInfo=function(_,g){return $.lgAjax({url:a,data:_,dataType:"jsonp",jsonp:"callback",success:function(a){if(0==a.state)if("PCP"==a.content.data.markLocation&&a.content.data[g].length>0){if($(".item_con_list li").length>0){var _=$("<i class='pos_icon'></i>");$(".item_con_list li").each(function(){$(this).find(".item_salary").before(_.clone())}),$(".item_title_date").css("margin-bottom","5px"),a.content.data[g].length>0&&$(".pos_icon").css("backgroundImage","url("+c+(a.content.data[g][1]||a.content.data[g][0])+")")}}else if("PCC"==a.content.data.markLocation&&a.content.data[g].length>0){var b=$('<i class="company_icon_dsz"></i>');$(".top_info_wrap").append(b.clone()),$(".company_icon_dsz").css("backgroundImage","url("+c+(a.content.data[g][1]||a.content.data[g][0])+")")}else if("PCB"==a.content.data.markLocation&&a.content.data[g].length>0)$(".top_info").addClass("super_bg").css("backgroundImage","url("+c+a.content.data[g][0]+")"),$("#company_navs").addClass("super_nav").css("backgroundImage","url("+c+a.content.data[g][1]+")"),$(".company_navs_wrap ul li a").css("color","#fff"),$(".company_navs_wrap ul li.current a").css("color","#f1ea8b"),$(".company_navs_wrap ul li.current").css("border-bottom-color","#f1ea8b"),$(".company_share span").css("color","#fff");else if("PPD"==a.content.data.markLocation&&a.content.data[g].length>0){var b=$('<i class="company_icon_dsz"></i>');$(".job-name .name").append(b.clone()),$(".company_icon_dsz").css("backgroundImage","url("+c+(a.content.data[g][1]||a.content.data[g][0])+")")}else if("PPF"==a.content.data.markLocation)for(var h=(g.split(","),$(".my_collections li")),_=$("<i class='pos_icon'></i>"),i=0;i<h.length;i++){var v=h.eq(i).data("company");a.content.data[v]&&a.content.data[v].length>0&&(h.eq(i).find(".co_time").before(_.clone()),h.eq(i).find(".pos_icon").css("backgroundImage","url("+c+(a.content.data[v][1]||a.content.data[v][0])+")"))}else if("PPR"==a.content.data.markLocation)for(var h=(g.split(","),$(".rec_pos_item")),_=$("<i class='pos_icon'></i>"),i=0;i<h.length;i++){var v=h.eq(i).data("company");a.content.data[v]&&a.content.data[v].length>0&&(h.eq(i).find(".coName").after(_.clone()),h.eq(i).find(".pos_icon").css("backgroundImage","url("+c+(a.content.data[v][1]||a.content.data[v][0])+")"))}else if("PPQ"==a.content.data.markLocation)for(var h=(g.split(","),$(".con_list_item")),_=$("<i class='pos_icon'></i>"),i=0;i<h.length;i++){var v=h.eq(i).data("companyid");a.content.data[v]&&a.content.data[v].length>0&&(h.eq(i).find(".p_top").append(_.clone()),h.eq(i).find(".pos_icon").css("backgroundImage","url("+c+(a.content.data[v][1]||a.content.data[v][0])+")")),$("ul.item_con_list .p_top h3").css("max-width","180px")}},error:function(){}})}});
/*!search-result/modules/positions/main.js*/
;/**
 * 职位列表
 *
 * nancyyang@lagou.com
 */

define('search-result/modules/positions/main', ['require', 'exports', 'module', 'common/widgets/plat/exposure', 'search-result/modules/common/js/config', 'common/components/util/emitter', 'common/components/pager/main', 'common/components/list-base/main', 'common/widgets/plat/addIcon'], function(require, exports, module) {
    var exposure = require('common/widgets/plat/exposure').exposure
        postoA = require('common/widgets/plat/exposure').postoA;
    var config = require('search-result/modules/common/js/config');

    var Emitter = require('common/components/util/emitter');

    var emitter = new Emitter();

    // 引入分页器
    var Pager = require('common/components/pager/main');

    // 引入list组件
    var List = require('common/components/list-base/main');

    var isSEO = $('#isSEO').val();
    var pageNoSEO = $('#pageNoSEO').val();
    var totalPageCountSEO = $('#totalPageCountSEO').val();
    // var pageSizeSEO = $('#pageSizeSEO').val();
    var resultLengthSEO = $('#resultLengthSEO').val();

    /**
     * filterOption
     * "1" // 默认值，从除结果页分页按钮以外的地方进入结果页
     * "2" // 有收起动画效果
     * "3" // 无收起动画效果
     */
    var filterOption = $('#filterOption').val();
    var positionCon = $('#s_position_list');
    //定义当前页面的缓存变量
    var positioinGlobal = {
        firstPage: true,
        maxPage: 30
    };
    $('.add em').each(function(){
        var a = $(this).text().split('·')[0];
        var temp = '';
        if(a.length >5){
            temp = a.substring(0, 5) + '…';
            $(this).text(temp);
        }
        else if($(this).text().length > 6){
            temp = $(this).text().substring(0, 6) + '…';
            $(this).text(temp);
        }

    });

    if(global.needAddtionalResult){
        if(global.keyword.length > 6){
            $('.no_position_wrapper .curr_com').text(global.keyword.substring(0,6) + '...');
        }
        else{
            $('.no_position_wrapper .curr_com').text(global.keyword);
        }
        $('.no_position_wrapper .curr_city').text(global.queryParam.city);
    }

    function getDataSucc( pn ) {
        initScrollTop();
        if ($('#footer').hasClass('footer_fix')) {
            fixFooter(356);
        } else {
            fixFooter(0);
        }

        if (pn == 1) {
            flipPV('jids');
        } else {
            flipPV('jids', pn);
        }

        // initActivityLogo(data);
        addIcon();
        //需要补余时候
        // if(global.needAddtionalResult == 'true'){
            if( isSEO == "false") {
                var total_page = Math.ceil(positioinGlobal.totalCount / positioinGlobal.pageSize);
                $('.totalNum').text(total_page);
                $('.curNum').text(positioinGlobal.pn);
            }
            else {
                if( parseInt( totalPageCountSEO ) > 30 ) {
                    totalPageCountSEO = 30;
                }
                $('.totalNum').text(totalPageCountSEO);
                $('.curNum').text(pageNoSEO);
            }
        // }
           checkApprove();
    }
    var requests = {

        getList: function(params) {
            var current_com = global.keyword;
            var _that = this;
            $.lgAjax({
                //需串上url参数,改为附后台传来参数
                url: config.url.positonlist + '?' + global.queryParamStr,
                 // url: "/jobs/positionAjax.json",
                dataType: 'json',
                data: params,
                type: 'POST',
                success: function(data, status, xhr) {

                    if(data.content.positionResult.length == 0 && global.needAddtionalResult){
                        $('.no_position_wrapper').hide();
                    }

                    //debugger
                    initParams(data,params.pn);
                    getDataSucc( params.pn );
                    _that.getHotEmployer(data.content.positionResult.result || [], params.pn)
                    /*try {
                        var inlineStyle = $(document.body).attr('style') || '';
                        if (inlineStyle && inlineStyle.indexOf('100%')>0) { // 360浏览器花屏短线解决方案，后续实现同步SEO需求，花屏问题自动解决。
                            setTimeout(function () {
                                $(document.body).css('width', 'auto');
                            }, 2000);
                        } else {
                            setTimeout(function () {
                                $(document.body).css('width', '100%');
                            }, 2000);
                        }
                    } catch (e) {}*/

                },
                error: function(xhr, errorType, error) {
                    go2err(xhr);
                }
            });
        },
        //新增热力雇主
        getHotEmployer: function (data,pn) {
            var companyArr = data;
            var newArr = []
            companyArr.forEach((item,index,arr)=>{
                newArr[index] = item.companyId;
            })
            $.lgAjax({
                headers: {
                    'X-L-REQ-HEADER': '{deviceType: 1}',
                },
                xhrFields: {
                    withCredentials: true
                },
                needNoToken: true,
                url: 'https://gate.lagou.com/v1/neirong/activity/company/list',
                // url: GLOBAL_DOMAIN.ctx+'/v1/neirong/activity/company/list',
                type: 'GET',
                dataType: 'json',
                data: {
                    pageNum: pn,
                    companyIds: newArr.join(',')
                }
            }).done(function(res){
                //插入到列表中,包含3个模块，company,position,company-card
                if(res.state == 1){
                    var hotList = res.content.list;
                    hotList.forEach(function(item,index){
                        var iconClass;
                        switch (item.currentEmployerType){
                            case 1:
                                iconClass = 'i-start'
                                break;
                            case 2:
                                iconClass = 'i-warm'
                                break;
                            case 3:
                                iconClass = 'i-hot'
                                break;
                            case 4:
                                iconClass = 'i-twinkle'
                                break;
                            case 5:
                                iconClass = 'i-boiling'
                                break;
                            case 6:
                                iconClass = 'i-burn'
                                break;
                            default: 
                                iconClass = 'i-start'
                                break;
                        }
                        //position模块
                        $('.s_position_list .con_list_item').each(function(){
                            if($(this).find('.icon-hotEmp').length == 0 && item.companyId == $(this).data('companyid')){
                                $(this).find('.company_name').append('<i class="icon-hotEmp '+iconClass+'"/>')
                            };
                        })
                    });                 
                
                    
                }
            }).fail(function(err){

            })
        }
    };

    function hoverCompany(){
        $('.company_mark').hover(function(){
            $(this).children('span').show();
        },function(){
            $(this).children('span').hide();
        })
    }
    //公司是否认证
    function checkApprove(){
        var companyIds = [];
        for(var i=0;i<$('.con_list_item').length;i++){
            companyIds[i] = $('.con_list_item').eq(i).attr('data-companyid');
        }
        function unique(arr) {
            var ret = []
            var hash = {}
            for (var i = 0; i < arr.length; i++) {
                var item = arr[i]
                var key = typeof(item) + item
                if (hash[key] !== 1) {
                    ret.push(item)
                    hash[key] = 1
                }
            }
            return ret
        }
        companyIds = unique(companyIds);
        companyIdStr = companyIds.join(",")
        $.lgAjax({
            url:GLOBAL_DOMAIN.ctx + "/c/approve.json",
            dataType: 'json',
            data: {
                companyIds: companyIdStr
            },
            type: 'GET',
            success:function(data){
                if(data.state == 1){
                    var $approve = $('<i class="company_mark"><span>该企业已上传营业执照并通过资质验证审核</span></i>')
                    var result = data.content.data.approveList;
                    var jobIds = [];
                    var joblists = $('.con_list_item');
                    for (var i = 0; i < joblists.length; i++) {
                        jobIds.push($(joblists[i]).data("companyid"));
                    }
                    for (var i = 0; i < joblists.length; i++) {
                        var companyid = $(joblists[i]).data("companyid");
                        if (result[companyid] == 1){
                            var item = $(joblists[i]).find(".company_name a");
                            item.after($approve.clone());
                        }else{
                            continue;
                        }

                    }
                    hoverCompany();
                }
            },
            error:function(){

            }
        });
    }

    function initScrollTop() {
        var url = window.location.toString();
        var id = url.split("#")[1];
        if(id){
            var t = $("#"+id).offset().top;
            $(window).scrollTop(t);
        }
    }

    function getSubStr() {
        $('.add em').each(function(){
            var a = $(this).text().split('·')[0];
            var temp = '';
            if(a.length >5){
                temp = a.substring(0, 5) + '…';
                $(this).text(temp);
            }
            else if($(this).text().length > 6){
                temp = $(this).text().substring(0, 6) + '…';
                $(this).text(temp);
            }
        });
    }
    function objList(key,id,headurl,hrname,pname,level,canTalk){
        this.key = key,
        this.userId = id,
        this.portrait= headurl,
        this.realName= hrname,
        this.positionName= pname,
        this.userLevel = level,
        this.canTalk = canTalk
    }
    function initParams(indata,curpage) {
        //debugger;
        var _page = indata.content.positionResult || {};
        positioinGlobal.data = _page.result || [];
        positioinGlobal.curCity = indata.content.city || '';
        positioinGlobal.pn = indata.content.pageNo || 1;
        positioinGlobal.pageSize = indata.content.pageSize || 15;
        positioinGlobal.totalCount = ((_page.totalCount >= positioinGlobal.maxPage * positioinGlobal.pageSize) ? positioinGlobal.maxPage * positioinGlobal.pageSize : _page.totalCount) || 0;
        var hrInfoMap = [];
        for(var one in indata.content.hrInfoMap){
            hrInfoMap.push(new objList(one,indata.content.hrInfoMap[one].userId,indata.content.hrInfoMap[one].portrait,indata.content.hrInfoMap[one].realName,indata.content.hrInfoMap[one].positionName,indata.content.hrInfoMap[one].userLevel,indata.content.hrInfoMap[one].canTalk))
        }
        for(var data=positioinGlobal.data,i=data.length-1;i>=0;i--){
            data[i].curpage = curpage;
        }
        positioinGlobal.data.hrInfoMap = hrInfoMap || [];
        // 初始化列表
        initList();
        getSubStr();

        // 如果是第一次加载页面需要初始化分页组件
        if (positioinGlobal.firstPage && positioinGlobal.totalCount > positioinGlobal.pageSize) {
            initPage();
            initBriefPage();
        }
    }

    function fixFooter(offset) {
        if ($(window).height() - offset > $(document.body).height()) {
            $('#footer').addClass('footer_fix');
        } else {
            $('#footer').removeClass('footer_fix');
        }
    }

    function initList() {
        var abtCode = $('#s_position_list input[name=abtCode]').val().trim();
        var list = new List({
            emitter: emitter,
            // 放列表的容器
            container: positionCon.find('.item_con_list'),
            // 模版id
            layout: '#tpl-position-list',
            data: positioinGlobal.data,
            extra: {
                abt : abtCode
            },
            curpage: positioinGlobal.pn,
            curcity: positioinGlobal.curCity,
            noempty: false,
            nomore: true,
            layoutempty: '#empty-position'

        });
        list.init();
    }

    function initPage() {
        var pager = new Pager({
            emitter: emitter,
            // 渲染容器
            container: positionCon.find('.item_con_pager'),
            // 总页数
            totalpage: Math.ceil(positioinGlobal.totalCount / positioinGlobal.pageSize),
            // 当前页数
            current: positioinGlobal.pn
        });
        pager.init();
    }

    function setFilterCollapse( time ) {
        $('#filterBrief').fadeIn(time);
        $('#filterCollapse').animate({
            "opacity": 0,
            "height": $('#filterBrief').height
        }, time, function() {
            $('#filterCollapse').hide();
        });
        $('.btn-collapse').addClass('collapsed');
        $('.btn-collapse').attr('title', '点击展开筛选项');

        $('body,html').animate({
                //scrollTop: $('#order').offset().top
                scrollTop: 0
            },
            500);
    }

    //排序框上的翻页按钮事件
    //harx
    function initBriefPage() {

        function BriefPager() {}

        BriefPager.prototype = {
            constructor: BriefPager,
            init: function() {
                var cont = $('#order').find('.page');
                this.elePrev = cont.find('.prev');
                this.eleNext = cont.find('.next');
                this.eleCurNum = cont.find('.curNum');
                this.totalPageNum = Math.ceil(positioinGlobal.totalCount / positioinGlobal.pageSize);
                this.pagerContainer = positionCon.find('.item_con_pager');
                this.initEvent();
            },
            initEvent: function() {
                var _this = this;
                this.elePrev.on('click', function() {
                    _this.prev();
                });
                this.eleNext.on('click', function() {
                    _this.next();
                });
                this.eventListener();
            },
            setCurNum: function(num) {
                this.eleCurNum.html(num);
            },
            prev: function() {
                this.pagerContainer.find('.pager_prev').trigger('click');
            },
            next: function() {
                this.pagerContainer.find('.pager_next').trigger('click');
            },
            /**
             * 监听页码器的事件，更新当前页码
             */
            eventListener: function() {
                var _this = this;
                emitter.on('pager:go', function(curPageNum) {
                    _this.setCurNum(curPageNum);
                    if (_this.eleCurNum.html() <= 1) {
                        _this.elePrev.addClass('ban');
                    } else if (_this.eleCurNum.html() >= _this.totalPageNum) {
                        _this.eleNext.addClass('ban');
                    } else {
                        _this.eleNext.removeClass('ban');
                        _this.elePrev.removeClass('ban');
                    }

                    setFilterCollapse( 500 );
                })
            }
        };

        var briefPager = new BriefPager();
        briefPager.init();
    }

    function go2err(xhr) {
        console.log(xhr);
    }

    var listParam = {
        //companyId:global.companyInfo.companyId,
        //默认是第一次加载
        first: true,
        pn: 1,
        kd: global.keyword
    };
     // requests.getList(listParam);
    if( isSEO == "false" ) {
        requests.getList(listParam);
    }
    else {
        if( pageNoSEO != 1 ) {
            listParam.first = false;
            positioinGlobal.firstPage = false;
        }
        listParam.pn = parseInt( pageNoSEO );
        listParam.kd = global.keyword;
        // positioinGlobal.pn = parseInt( pageNoSEO );
        // positioinGlobal.totalCount = parseInt( totalPageCountSEO );
        // positioinGlobal.pageSize = parseInt( pageSizeSEO );
        if(resultLengthSEO == 0 && global.needAddtionalResult){
            $('.no_position_wrapper').hide();
        }
        getSubStr();
        getDataSucc( parseInt( pageNoSEO ) );
        if( filterOption == "2" ) {
            setFilterCollapse( 500 );
        }
        var companyIds =[];
        $('.item_con_list .con_list_item').each(function(){
            companyIds.push({companyId:$(this).data('companyid')});
        });
        companyIds = companyIds.filter(function (item, index) {
            return companyIds.indexOf(item) === index
        })
        requests.getHotEmployer(companyIds, 1)
        // else if( filterOption == "3" ) {
        //     setFilterCollapse( 0 );
        // }
    }

    //分页点击事件
    emitter.on('pager:go', function(page) {
        //默认不是第一次加载
        listParam.first = false;
        listParam.pn = page;
        listParam.kd = global.keyword;
        positioinGlobal.pn = page;
        positioinGlobal.firstPage = false;
        requests.getList(listParam);
    });

    // 点击分页链接时，变换地址栏链接，filter收起标志
    $('.pager_container a, #order .page a').on( 'click', function (e) {
        e.preventDefault();
        if( filterOption == "1" || $('#filterCollapse').hasClass('collapsed') ) {
            window.location.href = $(this).attr('href') + '?filterOption=2';
        }
        else if( filterOption == "2" || filterOption == "3" ) {
            window.location.href = $(this).attr('href') + '?filterOption=3';
        }
    });

    function flipPV(ids, page) {
        // 职位列表曝光量统计
        var tjCodesNormal = [],
            tjCodesABT = [],
            abtCodes = [];
        var $positions = $('#s_position_list .con_list_item a.position_link');
        $positions.each(function(index, el) {
            if ($(el).attr('data-lg-tj-id')) {
                var tgId = $(el).attr('data-lg-tj-id') || 'idnull',
                    tgNo = $(el).attr('data-lg-tj-no') || 'idnull',
                    tgCid = $(el).attr('data-lg-tj-cid') || 'idnull';
                var abtCode = $(el).attr('data-lg-tj-abt') || '';
                if (!!abtCode && abtCode != '|') {
                    tjCodesABT.push([tgId, tgNo, tgCid]);
                    abtCodes.push(abtCode);
                } else {
                    tjCodesNormal.push([tgId, tgNo, tgCid]);
                }
            }
        });
        tjCodesABT.length > 0 && abtCodes.length > 0 && exposure(tjCodesABT, 'p', abtCodes);
        tjCodesNormal.length > 0 && exposure(tjCodesNormal, 'p');

        // 旧版 曝光统计 show日志统计
        // ====================
        //分页统计
        var currUrl = encodeURIComponent(document.URL);
        var hotJob = $('#s_position_list .con_list_item');
        var hotJobArray = [];
        hotJob.each(function(i) {
            var meId = $(this).attr('data-positionid');
            hotJobArray.push(meId);
        });
        var hotIdString = hotJobArray.join(',');
        var z = Math.random();
        var uids = hotIdString;
        var t = 'search';
        var params = {
            t: t,
            dl: currUrl,
            z: z
        };
        if (page) {
            params.pn = page;
        }
        if (ids == 'jids') {
            params['jids'] = uids;
        } else {
            params['cids'] = uids;
        }
        postoA(params);

    }

    //活动
    function unique(arr) {
            var ret = []
            var hash = {}
            for (var i = 0; i < arr.length; i++) {
                var item = arr[i]
                var key = typeof(item) + item
                if (hash[key] !== 1) {
                    ret.push(item)
                    hash[key] = 1
                }
            }
            return ret
    }
    function addIcon(){
        var companyIds = [];
        var companylists = $(".con_list_item");
        for (var i = 0; i < companylists.length; i++) {
            companyIds.push(companylists.eq(i).data("companyid"));
        }
        companyIds = unique(companyIds);
        var companyIdsStr = companyIds.join(",");

        var loadIconInfo = require('common/widgets/plat/addIcon').loadIconInfo;
        loadIconInfo({
            companyIds: companyIdsStr,
            markLocation:'PPQ'
        },companyIdsStr);
    }

    $('.pager_container .page_no, #order .page .curNum').on('click', function () {
        var _this = $(this);
        if( !_this.hasClass('pager_prev_disabled') && !_this.hasClass('pager_is_current') && !_this.hasClass('pager_next_disabled') ) {
            $('body,html').animate({
                //scrollTop: $('#order').offset().top
                scrollTop: 0
            }, 500);
        }
    });
});

/*!search-result/modules/company/main.js*/
;/**
 * 公司列表
 *
 * nancyyang@lagou.com
 */

define('search-result/modules/company/main', ['require', 'exports', 'module', 'search-result/modules/common/js/config', 'common/components/util/emitter', 'common/components/pager/main', 'common/components/list-base/main', 'common/widgets/plat/exposure'], function(require, exports, module) {

    var config = require('search-result/modules/common/js/config');

    var Emitter = require('common/components/util/emitter');

    var emitter = new Emitter();

    // 列表

    // 引入分页器
    var Pager = require('common/components/pager/main');

    // 引入list组件
    var List = require('common/components/list-base/main');

    var positionCon = $('#company_list');

    //定义当前页面的缓存变量
    var cmpGlobal = {
        maxPage: 30,
        firstPage: true,
        companyList: {}
    };

    var requests = {

        getList: function(params) {
            var _that = this;
            $.lgAjax({
                //需串上url参数,改为附后台传来参数
                url: config.url.companylist + '?' + global.queryParamStr,
                dataType: 'json',
                data: params,
                type: 'POST',
                success: function(data, status, xhr) {
                    //debugger
                    initParams(data,params.pn);
                    _that.getHotEmployer(data, params.pn)
                    if (params.pn == 1) {
                        flipPV('cids');
                    } else {
                        flipPV('cids', params.pn);
                    }

                },
                error: function(xhr, errorType, error) {
                    go2err(xhr);
                }
            });

        },
        //新增热力雇主
        getHotEmployer: function (data,pn) {
            var companyArr = data.content.result;
            var newArr = []
            companyArr.forEach((item,index,arr)=>{
                newArr[index] = item.companyId;
            })
            $.lgAjax({
                headers: {
                    'X-L-REQ-HEADER': '{deviceType: 1}',
                },
                xhrFields: {
                    withCredentials: true
                },
                needNoToken: true,
                url: 'https://gate.lagou.com/v1/neirong/activity/company/list',
                // url: GLOBAL_DOMAIN.ctx+'/v1/neirong/activity/company/list',
                type: 'GET',
                dataType: 'json',
                data: {
                    pageNum: pn,
                    companyIds: newArr.join(',')
                }
            }).done(function(res){
                //插入到列表中,包含3个模块，company,position,company-card
                if(res.state == 1){
                    var hotList = res.content.list;
                    hotList.forEach(function(item,index){
                        var iconClass;
                        switch (item.currentEmployerType){
                            case 1:
                                iconClass = 'i-start'
                                break;
                            case 2:
                                iconClass = 'i-warm'
                                break;
                            case 3:
                                iconClass = 'i-hot'
                                break;
                            case 4:
                                iconClass = 'i-twinkle'
                                break;
                            case 5:
                                iconClass = 'i-boiling'
                                break;
                            case 6:
                                iconClass = 'i-burn'
                                break;
                            default: 
                                iconClass = 'i-start'
                                break;
                        }
                        // company-card模块
                        $('.company-card').each(function(){
                            if($(this).find('.icon-hotEmp').length == 0 && item.companyId == $(this).find('a').data('lg-tj-cid')){
                                $(this).find('.cl_r_top h3').after('<i class="icon-hotEmp '+iconClass+'"/>')
                            };
                        })
                        //company模块
                        $('.company_list .c_list_item').each(function(){
                            if($(this).find('.icon-hotEmp').length == 0 && item.companyId == $(this).data('companyid')){
                                $(this).find('.cl_r_top h3').after('<i class="icon-hotEmp '+iconClass+'"/>')
                            };
                        })
                    });                 
                
                  
                }
            }).fail(function(err){

            })
        }
    };

    function initParams(data,curpage) {
        //debugger;
        var _page = data.content || {};
        cmpGlobal.data = _page.result || [];
        cmpGlobal.pn = _page.pageNo || 0;
        for(var data=cmpGlobal.data,i=data.length-1;i>=0;i--){
            data[i].curpage = curpage;
        }
        cmpGlobal.pageSize = _page.pageSize || 15;
        cmpGlobal.totalCount = ((_page.totalCount >= cmpGlobal.maxPage * cmpGlobal.pageSize) ? cmpGlobal.maxPage * cmpGlobal.pageSize : _page.totalCount) || 0;
        // 初始化列表
        initList();
        // 如果是第一次加载页面需要初始化分页组件
        if (cmpGlobal.firstPage && cmpGlobal.totalCount > 10) {
            initPage();
        }
    }

    function go2err(xhr) {
        console.log(xhr);
    }
    //公司列表
    function initList() {
        var abtCode = $('#company_list input[name=abtCode]').val().trim();
        var list = new List({
            emitter: emitter,
            // 放列表的容器
            container: positionCon.find('.item_con_list'),
            // 模版id
            layout: '#tpl-comp-list',
            data: cmpGlobal.data,
            extra: {
                abt : abtCode
            },
            curpage: cmpGlobal.pn,
            noempty: false,
            nomore: true,
            layoutempty: '#empty-comp'
        });
        list.init()
    }
    //公职位列表
    function initPage() {
        var pager = new Pager({
            emitter: emitter,
            // 渲染容器
            container: positionCon.find('.item_con_pager'),
            // 总页数
            totalpage: Math.ceil(cmpGlobal.totalCount / cmpGlobal.pageSize),
            // 当前页数
            current: cmpGlobal.pn
        });
        pager.init();
    }

    var listParam = {
        //companyId:global.companyInfo.companyId,
        //默认是第一次加载
        first: true,
        pn: 1,
        kd: global.keyword
    };
    requests.getList(listParam);
    //分页点击事件
    emitter.on('pager:go', function(page) {
        //默认不是第一次加载
        listParam.first = false;
        listParam.pn = page;
        cmpGlobal.pn = page;
        listParam.kd = global.keyword;
        cmpGlobal.firstPage = false;
        requests.getList(listParam);

        $('body,html').animate({
                //scrollTop: $('#company_list').offset().top
                scrollTop: 0
            },
            500);
    });

    var exposure = require('common/widgets/plat/exposure').exposure,
        postoA = require('common/widgets/plat/exposure').postoA;

    function flipPV(ids, page) {
        // 公司列表曝光量统计
        var tjCodesNormal = [],
            tjCodesABT = [],
            abtCodes = [];
        var $companys = $('#company_list .c_list_item a.company_link');
        $companys.each(function(index, el) {
            if ($(el).attr('data-lg-tj-id')) {
                var tgId = $(el).attr('data-lg-tj-id') || 'idnull',
                    tgNo = $(el).attr('data-lg-tj-no') || 'idnull',
                    tgCid = $(el).attr('data-lg-tj-cid') || 'idnull';
                var abtCode = $(el).attr('data-lg-tj-abt') || '';
                if (!!abtCode && abtCode != '|') {
                    tjCodesABT.push([tgId, tgNo, tgCid]);
                    abtCodes.push(abtCode);
                } else {
                    tjCodesNormal.push([tgId, tgNo, tgCid]);
                }
            }
        });
        tjCodesABT.length > 0 && abtCodes.length > 0 && exposure(tjCodesABT, 'c', abtCodes);
        tjCodesNormal.length > 0 && exposure(tjCodesNormal, 'c');
        
        // 旧版 曝光统计 show日志统计
        // ====================
        //分页统计
        var currUrl = encodeURIComponent(document.URL);
        var hotJob = $('#company_list .c_list_item');
        var hotJobArray = [];
        hotJob.each(function(i) {
            var meId = $(this).attr('data-companyid');
            hotJobArray.push(meId);
        });
        var hotIdString = hotJobArray.join(',');
        var z = Math.random();
        var uids = hotIdString;
        var t = 'search';
        var params = {
            t: t,
            dl: currUrl,
            z: z
        };
        if (page) {
            params.pn = page;
        }
        if (ids == 'jids') {
            params['jids'] = uids;
        } else {
            params['cids'] = uids;
        }
        postoA(params);
    }
});

/*!search-result/modules/filter/main.js*/
;define("search-result/modules/filter/main",["require","exports","module"],function(){function a(a,c){c||(c=window.location.href),a=a.replace(/[\[\]]/g,"\\$&");var h=new RegExp("[?&]"+a+"(=([^&#]*)|&|#|$)"),$=h.exec(c);return $?$[2]?decodeURIComponent($[2].replace(/\+/g," ")):"":null}function c(a){C.fadeToggle(500),g.toggleClass("collapsed");var c=a;c.hasClass("collapsed")?(g.show(),g.animate({opacity:1,height:b},500),3==filterOption&&v(),g.height(),c.removeClass("collapsed"),c.attr("title","点击收起筛选项")):(b=g.height(),g.animate({opacity:0,height:w},500,function(){g.hide()}),c.addClass("collapsed"),c.attr("title","点击展开筛选项"))}function h(){var c=[],h=[],v=[],y=[],C=[],g="",w="",b="",L="",I="";$(".multi-chosen").each(function(){var a=$.trim($(this).children(".title").text());"不限"!=$.trim($(this).find(".chosen").text())&&(("工作经验："==a||"工作性质："==a)&&$(this).find(".chosen").each(function(){c.push($.trim($(this).text()))}),"学历要求："==a&&$(this).find(".chosen").each(function(){h.push($.trim($(this).text()))}),"融资阶段："==a&&$(this).find(".chosen").each(function(){y.push($.trim($(this).text()))}),"行业领域："==a&&$(this).find(".chosen").each(function(){-1==$.inArray($.trim($(this).text()),C)&&C.push($.trim($(this).text()))}),"公司规模："==a&&$(this).find(".chosen").each(function(){v.push($.trim($(this).text()))}))}),$(".other-hy").find(".chosen").each(function(){-1==$.inArray($.trim($(this).text()),C)&&C.push($.trim($(this).text()))}),g=$(".current_city").text(),w=$(".current_district").text(),b=$(".current_bizArea").text(),L=$(".current-subway").text(),I=$(".current-route").text();var j=[],B="1"===a("isSchoolJob",location.search),k=-1!=$.inArray("应届毕业生",c);c.length>0&&j.push(k||B?"&gj=":"&gj="+c.join(",")),h.length>0&&j.push("&xl="+h.join(",")),y.length>0&&j.push("&jd="+y.join(",")),C.length>0&&j.push("&hy="+C.join(",")),v.length>0&&j.push("&gm="+v.join(",")),A=j.join(""),g&&(_+="&city="+g),w&&"不限"!=w&&(_+="&district="+w),b&&"不限"!=b&&(_+="&bizArea="+b),L&&(_+="&subwayLine="+L),I&&"不限"!=I&&(_+="&subwayStation="+I),$("#order .order a").each(function(){$(this).hasClass("active")&&("默认"==$.trim($(this).text())?O+="px=default":"最新"==$.trim($(this).text())&&(O+="px=new"))}),"不限"!=$.trim($("#order .salary .text span").text())&&(O+="&yx="+$.trim($("#order .salary .text span").text()));var N=$.trim($("#order .type .text span").text());k||-1!=$.inArray("应届",c)?O+="&gx=全职":B?O+="&gx="+c.join(","):"不限"!=N&&(O+="&gx="+N),(-1!=$.inArray("应届毕业生",c)||"实习"===N||B)&&(A+="&isSchoolJob=1")}function v(){var a=872-$(".current-handle-position").width(),c=$(".current-handle-position").width();$(".city-wrapper").css("margin-left",c+"px"),$(".city-wrapper").width(a),$(".city-wrapper").css("overflow","hidden"),$(".city-wrapper").show()}var y=$("#filterBox"),C=$("#filterBrief"),g=$("#filterCollapse"),w=C.height();allHeight=g.height(),filterOption=$("#filterOption").val(),$(".has-more").on("click",function(){g.height("initial")}),y.find(".btn-more").hover(function(){$(this).parent().addClass("active").next().addClass("unfolded")},function(){$(this).parent().removeClass("active").next().removeClass("unfolded")}),y.find(".more").hover(function(){$(this).addClass("unfolded").next().find(".other-hot-city").addClass("active")},function(){$(this).removeClass("unfolded").next().find(".other-hot-city").removeClass("active")}),y.find(".btn-more-hy").hover(function(){$(this).parent().addClass("active").next().addClass("unfolded")},function(){$(this).parent().removeClass("active").next().removeClass("unfolded")}),y.find(".more-fields").hover(function(){$(this).addClass("unfolded").prev().addClass("active")},function(){$(this).removeClass("unfolded").prev().removeClass("active")}),"true"==global.isShowMoreIndustryField&&y.find(".btn-more-hy").parent().addClass("active").next().addClass("unfolded"),$(".other-hot-city .btn-more").hover(function(){$(".more-positions").addClass("unfolded")},function(){$(".more-positions").removeClass("unfolded")}),$(".btn-collapse").add(".li-taller .active").click(function(){c($(".btn-collapse"))});var b=g.height();$("#all_city").on("click",function(){A="",_="",O="";var a="&positionNum="+global.positionNum+"&companyNum="+global.companyNum+"&isCompanySelected="+global.isCompanySelected+"&labelWords="+global.searchTj.labelWords;if(h(),global.keyword)var c=GLOBAL_DOMAIN.ctx+"/jobs/allCity.html?keyword="+encodeURIComponent(global.keyword)+"&"+O+A+_+a;else var c=GLOBAL_DOMAIN.ctx+"/jobs/allCity.html?"+O+A+_+a;window.location.href=c});var A="",_="",O="";h(),v(),$(".hot-city-name, .more-city-name").on("click",function(){A="",_="",O="",h();var a=$(this).text();if("全国"==a)var c=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"#filterBox";else var c=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"#filterBox";window.location.href=c}),$('.detail-district-area, .choose-detail .tab-versus-content .contents[data-type="district"]').on("click","a",function(){A="",_="",O="",h();var a=$(".current_city").text(),c=$(this).text();if("不限"==c)var v=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"#filterBox";else var v=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"&district="+c+"#filterBox";window.location.href=v}),$('.detail-area.detail-subway-area, .choose-detail .tab-versus-content .contents[data-type="subway"]').on("click","a",function(){A="",_="",O="",h();var a=$(".current_city").text(),c=$(this).text(),v=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"&subwayLine="+c+"#filterBox";window.location.href=v}),$(".detail-bizArea-area").on("click","a",function(){A="",_="",O="",h();var a=$(".current_city").text(),c=$(".current_district").text(),v=$(this).text();if("不限"==v)var y=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"&district="+c+"#filterBox";else var y=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"&district="+c+"&bizArea="+v+"#filterBox";window.location.href=y}),$(".detail-area.detail-route-area").on("click","a",function(){A="",_="",O="",h();var a=$(".current_city").text(),c=$(".current-subway").text(),v=$(this).text(),y=GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+"&city="+a+"&subwayLine="+c+("不限"==v?"":"&subwayStation="+v)+"#filterBox";window.location.href=y}),$(".multi-chosen").on("click","a",function(){var a;if($(this).hasClass("chosen"))if("行业领域："==$(this).parent().find(".title").text()||$(this).parent().hasClass("other-hy")){var c=$.trim($(this).text());$(".hy-area a").each(function(){$.trim($(this).text())==c&&($(this).children(".delete").hide(),$(this).removeClass("chosen"))})}else $(this).children(".delete").hide(),$(this).removeClass("chosen");else if("不限"==$.trim($(this).text()))$(this).addClass("active"),"行业领域："==$(this).parent().find(".title").text()||$(this).parent().hasClass("other-hy")?$(".hy-area a").removeClass("chosen"):$(this).parent(".multi-chosen").find("a").removeClass("chosen");else if("工作性质："==$(this).parent().find(".title").text()&&$(this).siblings().removeClass("chosen"),"不限"==$.trim($(this).text()))$(this).addClass("active");else if("行业领域："==$(this).parent().find(".title").text()||$(this).parent().hasClass("other-hy")){var c=$.trim($(this).text());$(".hy-area a").each(function(){$.trim($(this).text())==c&&($(this).addClass("chosen"),$(this).children(".delete").show())})}else $(this).addClass("chosen"),$(this).children(".delete").show();A="",_="",O="",h(),a=$(".other-hy a.chosen").length>0?GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+_+"&isShowMoreIndustryField=true":GLOBAL_DOMAIN.ctx+"/jobs/list_"+encodeURIComponent($("#keyword").val())+"?"+O+A+_,a+="true"==global.needAddtionalResult?"&needAddtionalResult=true#filterBox":"#filterBox",window.location.href=a});var L=$(".tab-versus-content");$(".tab-versus-content .tabs li").on("mouseenter",function(){var a=$(this),c=a.attr("data-type"),h="-tab-active",v=c+h,y=L.attr("class").split(/\s+/),C=L.find('.tabs li[data-type="district"]').outerHeight(!1),w=L.find('.tabs li[data-type="subway"]');y=y.filter(function(a){return a.indexOf(h)<0}),L.attr("class",y.join(" ")+" "+v),g.height("initial");var b=L.find('.contents[data-type="'+c+'"]').innerHeight();w.css("height",Math.max(b-C,C))}),g.on("click",".toggle-anchor",function(){var a=$(this),c=a.attr("data-toggle-type"),h=g.find(".toggle-anchor"),v=g.find(".toggle-target"),y=v.filter('[data-toggle-type="'+c+'"]');y.length>0?a.hasClass("active")?(a.removeClass("active"),y.hide()):(h.removeClass("active"),v.hide(),a.addClass("active"),y.show()):(y=g.find('.toggle-target[data-toggle-type="district-and-subway"]'),a.hasClass("active")?(a.removeClass("active"),y.hide()):(h.removeClass("active"),v.hide(),a.addClass("active"),$('.tab-versus-content .tabs li[data-type="'+c+'"]').trigger("mouseenter"),y.show()))})});
/*!search-result/modules/order/main.js*/
;define("search-result/modules/order/main",["require","exports","module"],function(){var a=$("#order"),c=a.find(".selectUI");c.find("li a").click(function(){$(this).parent().parent().prev().find("span").html($(this).html()).parent().parent().removeClass("active")}),$(document).on("click",function(a){c.find(".selectUI-text").each(function(c,h){$(a.target).closest(h).length>0?$(h).parent().toggleClass("active"):$(h).parent().removeClass("active")})}),$("#order .page a").on("click",function(){var a=$(this);a.hasClass("prev_disabled")||a.hasClass("next_disabled")||$("body,html").animate({scrollTop:0},500)})});
/*!search-result/modules/list-tips/main.js*/
;define("search-result/modules/list-tips/main",["require","exports","module","common/widgets/plat/exposure"],function(require){var a=require("common/widgets/plat/exposure").exposure;if($("#paiListTip").size()>0){var c=$("#paiListTip");sessionStorage.banSearchPaiListTip&&"0"!=sessionStorage.banSearchPaiListTip||(c.show(),$("#switchCity").hide());var g=c.find(".btn_close");g.on("click",function(){c.hide(),sessionStorage.banSearchPaiListTip=1});var h=$("#paiListTip");a([[h.attr("data-lg-tj-id"),h.attr("data-lg-tj-no"),h.attr("data-lg-tj-cid")]],"t")}});
/*!search-result/modules/history/main.js*/
;define("search-result/modules/history/main",["require","exports","module","search-result/modules/common/js/config","common/components/util/emitter"],function(require){function a(a){console.log(a)}function c(a){var c=a.content;if(null===c||0===c.length)v();else{for(var g="",i=0;i<c.length;i++)g+='<li class="p_list_item"><div><a href="'+global.ctx+"/jobs/"+c[i].positionId+'.html" target="_blank" class="name" title="'+c[i].positionName+'">'+c[i].positionName+'</a><div class="salary">'+c[i].salary+'</div><div class="c_name" title="'+c[i].companyName+'">'+c[i].companyName+"</div></div></li>";I.removeClass("dn"),$("#history_position_list").html(g)}}function g(a,c,g,_){var h=!1,y=[],S=5,I=a+","+c+","+g+","+_+"|",O=window.localStorage&&localStorage.HISTORY_POSITION||"";if(O){y=O.split("|");for(var b="",i=0,w=y.length;w>i;i++){var T=y[i].split(",")[0];if(T==a){h=!0,b=T;break}}if(h){var k=new RegExp(b+",.*?\\|"),L=k.exec(O);I=O.replace(L,""),I=L+I}else{if(y.length>=S+1){var N=O.lastIndexOf("|",O.length-2);O=O.substring(0,N+1)}I+=O}window.localStorage&&(localStorage.HISTORY_POSITION=I),v()}else window.localStorage&&(localStorage.HISTORY_POSITION=I),v()}function v(){var a=window.localStorage&&localStorage.HISTORY_POSITION||"",c="";if(a){var g=a.split("|");g.pop();for(var i=0;i<g.length;i++){var s=g[i].split(",");c+='<li class="p_list_item" data-positionid="'+s[0]+'" data-salary="'+s[1]+'" data-company="'+s[2]+'" data-positionname="'+s[3]+'"><div class="position_link"><a href="'+global.ctx+"/jobs/"+s[0]+'.html" target="_blank" class="name" title="'+s[3]+'">'+s[3]+'</a><div class="salary">'+s[1]+'</div><div class="c_name" title="'+s[2]+'">'+s[2]+"</div></div></li>"}I.removeClass("dn"),$("#history_position_list").html(c)}else I.addClass("dn")}{var _=require("search-result/modules/common/js/config"),h=require("common/components/util/emitter");new h}$("body").on("click",".item_con_list .con_list_item,.history_position_list .p_list_item",function(e){var a=e.target?e.target:e.srcElement,c=$(this),v=c.attr("data-positionid"),_=c.attr("data-salary"),h=c.attr("data-company"),y=c.attr("data-positionname");($(a).hasClass("position_link")||$(a).parents(".position_link").hasClass("position_link"))&&(global.isLogin?S.getLoginHistoryList():g(v,_,h,y))});var y={},S={getLoginHistoryList:function(){$.lgAjax({url:_.url.loginhistory,dataType:"json",data:y,success:function(a){c(a)},error:function(c){a(c)}})}},I=$(".history");global.isLogin?S.getLoginHistoryList():v()});
/*!search-result/modules/recommendCompanyCity/main.js*/
;define("search-result/modules/recommendCompanyCity/main",["require","exports","module","search-result/modules/common/js/config"],function(require){function c(c,a){a.on("click",function(){var h=$(this);c.hasClass("hide-recom")?(c.removeClass("hide-recom"),a.html("收起<i></i>"),h.find("i").addClass("i-up")):(c.addClass("hide-recom"),a.html("展开<i></i>"),h.find("i").removeClass("i-up"))})}{var a=(require("search-result/modules/common/js/config"),$(".search-wrapper"));a.find(".r_search_con"),$.trim($("#keyword").val())}c($("#s_position_list .recommend-comp-city"),$("#s_position_list .expansion")),c($("#company_list .recommend-comp-city"),$("#company_list .expansion"))});
/*!dep/jquery-qrcode/jquery.qrcode.min.js*/
;define("dep/jquery-qrcode/jquery.qrcode.min",["require","exports","module"],function(){!function(r){r.fn.qrcode=function(a){function u(a){this.mode=s,this.data=a}function o(a,h){this.typeNumber=a,this.errorCorrectLevel=h,this.modules=null,this.moduleCount=0,this.dataCache=null,this.dataList=[]}function q(a,h){if(void 0==a.length)throw Error(a.length+"/"+h);for(var d=0;d<a.length&&0==a[d];)d++;this.num=Array(a.length-d+h);for(var g=0;g<a.length-d;g++)this.num[g]=a[g+d]}function p(a,h){this.totalCount=a,this.dataCount=h}function t(){this.buffer=[],this.length=0}var s;u.prototype={getLength:function(){return this.data.length},write:function(a){for(var h=0;h<this.data.length;h++)a.put(this.data.charCodeAt(h),8)}},o.prototype={addData:function(a){this.dataList.push(new u(a)),this.dataCache=null},isDark:function(a,h){if(0>a||this.moduleCount<=a||0>h||this.moduleCount<=h)throw Error(a+","+h);return this.modules[a][h]},getModuleCount:function(){return this.moduleCount},make:function(){if(1>this.typeNumber){for(var a=1,a=1;40>a;a++){for(var g=p.getRSBlocks(a,this.errorCorrectLevel),d=new t,c=0,e=0;e<g.length;e++)c+=g[e].dataCount;for(e=0;e<this.dataList.length;e++)g=this.dataList[e],d.put(g.mode,4),d.put(g.getLength(),h.getLengthInBits(g.mode,a)),g.write(d);if(d.getLengthInBits()<=8*c)break}this.typeNumber=a}this.makeImpl(!1,this.getBestMaskPattern())},makeImpl:function(a,h){this.moduleCount=4*this.typeNumber+17,this.modules=Array(this.moduleCount);for(var d=0;d<this.moduleCount;d++){this.modules[d]=Array(this.moduleCount);for(var g=0;g<this.moduleCount;g++)this.modules[d][g]=null}this.setupPositionProbePattern(0,0),this.setupPositionProbePattern(this.moduleCount-7,0),this.setupPositionProbePattern(0,this.moduleCount-7),this.setupPositionAdjustPattern(),this.setupTimingPattern(),this.setupTypeInfo(a,h),7<=this.typeNumber&&this.setupTypeNumber(a),null==this.dataCache&&(this.dataCache=o.createData(this.typeNumber,this.errorCorrectLevel,this.dataList)),this.mapData(this.dataCache,h)},setupPositionProbePattern:function(a,h){for(var d=-1;7>=d;d++)if(!(-1>=a+d||this.moduleCount<=a+d))for(var g=-1;7>=g;g++)-1>=h+g||this.moduleCount<=h+g||(this.modules[a+d][h+g]=d>=0&&6>=d&&(0==g||6==g)||g>=0&&6>=g&&(0==d||6==d)||d>=2&&4>=d&&g>=2&&4>=g?!0:!1)},getBestMaskPattern:function(){for(var a=0,g=0,d=0;8>d;d++){this.makeImpl(!0,d);var c=h.getLostPoint(this);(0==d||a>c)&&(a=c,g=d)}return g},createMovieClip:function(a,h,d){for(a=a.createEmptyMovieClip(h,d),this.make(),h=0;h<this.modules.length;h++)for(var d=1*h,g=0;g<this.modules[h].length;g++){var e=1*g;this.modules[h][g]&&(a.beginFill(0,100),a.moveTo(e,d),a.lineTo(e+1,d),a.lineTo(e+1,d+1),a.lineTo(e,d+1),a.endFill())}return a},setupTimingPattern:function(){for(var a=8;a<this.moduleCount-8;a++)null==this.modules[a][6]&&(this.modules[a][6]=0==a%2);for(a=8;a<this.moduleCount-8;a++)null==this.modules[6][a]&&(this.modules[6][a]=0==a%2)},setupPositionAdjustPattern:function(){for(var a=h.getPatternPosition(this.typeNumber),g=0;g<a.length;g++)for(var d=0;d<a.length;d++){var c=a[g],e=a[d];if(null==this.modules[c][e])for(var f=-2;2>=f;f++)for(var i=-2;2>=i;i++)this.modules[c+f][e+i]=-2==f||2==f||-2==i||2==i||0==f&&0==i?!0:!1}},setupTypeNumber:function(a){for(var g=h.getBCHTypeNumber(this.typeNumber),d=0;18>d;d++){var c=!a&&1==(g>>d&1);this.modules[Math.floor(d/3)][d%3+this.moduleCount-8-3]=c}for(d=0;18>d;d++)c=!a&&1==(g>>d&1),this.modules[d%3+this.moduleCount-8-3][Math.floor(d/3)]=c},setupTypeInfo:function(a,g){for(var d=h.getBCHTypeInfo(this.errorCorrectLevel<<3|g),c=0;15>c;c++){var e=!a&&1==(d>>c&1);6>c?this.modules[c][8]=e:8>c?this.modules[c+1][8]=e:this.modules[this.moduleCount-15+c][8]=e}for(c=0;15>c;c++)e=!a&&1==(d>>c&1),8>c?this.modules[8][this.moduleCount-c-1]=e:9>c?this.modules[8][15-c-1+1]=e:this.modules[8][15-c-1]=e;this.modules[this.moduleCount-8][8]=!a},mapData:function(a,g){for(var d=-1,c=this.moduleCount-1,e=7,f=0,i=this.moduleCount-1;i>0;i-=2)for(6==i&&i--;;){for(var C=0;2>C;C++)if(null==this.modules[c][i-C]){var n=!1;f<a.length&&(n=1==(a[f]>>>e&1)),h.getMask(g,c,i-C)&&(n=!n),this.modules[c][i-C]=n,e--,-1==e&&(f++,e=7)}if(c+=d,0>c||this.moduleCount<=c){c-=d,d=-d;break}}}},o.PAD0=236,o.PAD1=17,o.createData=function(a,g,d){for(var g=p.getRSBlocks(a,g),c=new t,e=0;e<d.length;e++){var f=d[e];c.put(f.mode,4),c.put(f.getLength(),h.getLengthInBits(f.mode,a)),f.write(c)}for(e=a=0;e<g.length;e++)a+=g[e].dataCount;if(c.getLengthInBits()>8*a)throw Error("code length overflow. ("+c.getLengthInBits()+">"+8*a+")");for(c.getLengthInBits()+4<=8*a&&c.put(0,4);0!=c.getLengthInBits()%8;)c.putBit(!1);for(;!(c.getLengthInBits()>=8*a)&&(c.put(o.PAD0,8),!(c.getLengthInBits()>=8*a));)c.put(o.PAD1,8);return o.createBytes(c,g)},o.createBytes=function(a,g){for(var d=0,c=0,e=0,f=Array(g.length),i=Array(g.length),C=0;C<g.length;C++){var n=g[C].dataCount,v=g[C].totalCount-n,c=Math.max(c,n),e=Math.max(e,v);f[C]=Array(n);for(var L=0;L<f[C].length;L++)f[C][L]=255&a.buffer[L+d];for(d+=n,L=h.getErrorCorrectPolynomial(v),n=new q(f[C],L.getLength()-1).mod(L),i[C]=Array(L.getLength()-1),L=0;L<i[C].length;L++)v=L+n.getLength()-i[C].length,i[C][L]=v>=0?n.get(v):0}for(L=C=0;L<g.length;L++)C+=g[L].totalCount;for(d=Array(C),L=n=0;c>L;L++)for(C=0;C<g.length;C++)L<f[C].length&&(d[n++]=f[C][L]);for(L=0;e>L;L++)for(C=0;C<g.length;C++)L<i[C].length&&(d[n++]=i[C][L]);return d},s=4;for(var h={PATTERN_POSITION_TABLE:[[],[6,18],[6,22],[6,26],[6,30],[6,34],[6,22,38],[6,24,42],[6,26,46],[6,28,50],[6,30,54],[6,32,58],[6,34,62],[6,26,46,66],[6,26,48,70],[6,26,50,74],[6,30,54,78],[6,30,56,82],[6,30,58,86],[6,34,62,90],[6,28,50,72,94],[6,26,50,74,98],[6,30,54,78,102],[6,28,54,80,106],[6,32,58,84,110],[6,30,58,86,114],[6,34,62,90,118],[6,26,50,74,98,122],[6,30,54,78,102,126],[6,26,52,78,104,130],[6,30,56,82,108,134],[6,34,60,86,112,138],[6,30,58,86,114,142],[6,34,62,90,118,146],[6,30,54,78,102,126,150],[6,24,50,76,102,128,154],[6,28,54,80,106,132,158],[6,32,58,84,110,136,162],[6,26,54,82,110,138,166],[6,30,58,86,114,142,170]],G15:1335,G18:7973,G15_MASK:21522,getBCHTypeInfo:function(a){for(var g=a<<10;0<=h.getBCHDigit(g)-h.getBCHDigit(h.G15);)g^=h.G15<<h.getBCHDigit(g)-h.getBCHDigit(h.G15);return(a<<10|g)^h.G15_MASK},getBCHTypeNumber:function(a){for(var g=a<<12;0<=h.getBCHDigit(g)-h.getBCHDigit(h.G18);)g^=h.G18<<h.getBCHDigit(g)-h.getBCHDigit(h.G18);return a<<12|g},getBCHDigit:function(a){for(var h=0;0!=a;)h++,a>>>=1;return h},getPatternPosition:function(a){return h.PATTERN_POSITION_TABLE[a-1]},getMask:function(a,h,d){switch(a){case 0:return 0==(h+d)%2;case 1:return 0==h%2;case 2:return 0==d%3;case 3:return 0==(h+d)%3;case 4:return 0==(Math.floor(h/2)+Math.floor(d/3))%2;case 5:return 0==h*d%2+h*d%3;case 6:return 0==(h*d%2+h*d%3)%2;case 7:return 0==(h*d%3+(h+d)%2)%2;default:throw Error("bad maskPattern:"+a)}},getErrorCorrectPolynomial:function(a){for(var h=new q([1],0),d=0;a>d;d++)h=h.multiply(new q([1,l.gexp(d)],0));return h},getLengthInBits:function(a,h){if(h>=1&&10>h)switch(a){case 1:return 10;case 2:return 9;case s:return 8;case 8:return 8;default:throw Error("mode:"+a)}else if(27>h)switch(a){case 1:return 12;case 2:return 11;case s:return 16;case 8:return 10;default:throw Error("mode:"+a)}else{if(!(41>h))throw Error("type:"+h);switch(a){case 1:return 14;case 2:return 13;case s:return 16;case 8:return 12;default:throw Error("mode:"+a)}}},getLostPoint:function(a){for(var h=a.getModuleCount(),d=0,g=0;h>g;g++)for(var e=0;h>e;e++){for(var f=0,i=a.isDark(g,e),c=-1;1>=c;c++)if(!(0>g+c||g+c>=h))for(var C=-1;1>=C;C++)0>e+C||e+C>=h||0==c&&0==C||i==a.isDark(g+c,e+C)&&f++;f>5&&(d+=3+f-5)}for(g=0;h-1>g;g++)for(e=0;h-1>e;e++)f=0,a.isDark(g,e)&&f++,a.isDark(g+1,e)&&f++,a.isDark(g,e+1)&&f++,a.isDark(g+1,e+1)&&f++,(0==f||4==f)&&(d+=3);for(g=0;h>g;g++)for(e=0;h-6>e;e++)a.isDark(g,e)&&!a.isDark(g,e+1)&&a.isDark(g,e+2)&&a.isDark(g,e+3)&&a.isDark(g,e+4)&&!a.isDark(g,e+5)&&a.isDark(g,e+6)&&(d+=40);for(e=0;h>e;e++)for(g=0;h-6>g;g++)a.isDark(g,e)&&!a.isDark(g+1,e)&&a.isDark(g+2,e)&&a.isDark(g+3,e)&&a.isDark(g+4,e)&&!a.isDark(g+5,e)&&a.isDark(g+6,e)&&(d+=40);for(e=f=0;h>e;e++)for(g=0;h>g;g++)a.isDark(g,e)&&f++;return a=Math.abs(100*f/h/h-50)/5,d+10*a}},l={glog:function(a){if(1>a)throw Error("glog("+a+")");return l.LOG_TABLE[a]},gexp:function(a){for(;0>a;)a+=255;for(;a>=256;)a-=255;return l.EXP_TABLE[a]},EXP_TABLE:Array(256),LOG_TABLE:Array(256)},m=0;8>m;m++)l.EXP_TABLE[m]=1<<m;for(m=8;256>m;m++)l.EXP_TABLE[m]=l.EXP_TABLE[m-4]^l.EXP_TABLE[m-5]^l.EXP_TABLE[m-6]^l.EXP_TABLE[m-8];for(m=0;255>m;m++)l.LOG_TABLE[l.EXP_TABLE[m]]=m;return q.prototype={get:function(a){return this.num[a]},getLength:function(){return this.num.length},multiply:function(a){for(var h=Array(this.getLength()+a.getLength()-1),d=0;d<this.getLength();d++)for(var g=0;g<a.getLength();g++)h[d+g]^=l.gexp(l.glog(this.get(d))+l.glog(a.get(g)));return new q(h,0)},mod:function(a){if(0>this.getLength()-a.getLength())return this;for(var h=l.glog(this.get(0))-l.glog(a.get(0)),d=Array(this.getLength()),g=0;g<this.getLength();g++)d[g]=this.get(g);for(g=0;g<a.getLength();g++)d[g]^=l.gexp(l.glog(a.get(g))+h);return new q(d,0).mod(a)}},p.RS_BLOCK_TABLE=[[1,26,19],[1,26,16],[1,26,13],[1,26,9],[1,44,34],[1,44,28],[1,44,22],[1,44,16],[1,70,55],[1,70,44],[2,35,17],[2,35,13],[1,100,80],[2,50,32],[2,50,24],[4,25,9],[1,134,108],[2,67,43],[2,33,15,2,34,16],[2,33,11,2,34,12],[2,86,68],[4,43,27],[4,43,19],[4,43,15],[2,98,78],[4,49,31],[2,32,14,4,33,15],[4,39,13,1,40,14],[2,121,97],[2,60,38,2,61,39],[4,40,18,2,41,19],[4,40,14,2,41,15],[2,146,116],[3,58,36,2,59,37],[4,36,16,4,37,17],[4,36,12,4,37,13],[2,86,68,2,87,69],[4,69,43,1,70,44],[6,43,19,2,44,20],[6,43,15,2,44,16],[4,101,81],[1,80,50,4,81,51],[4,50,22,4,51,23],[3,36,12,8,37,13],[2,116,92,2,117,93],[6,58,36,2,59,37],[4,46,20,6,47,21],[7,42,14,4,43,15],[4,133,107],[8,59,37,1,60,38],[8,44,20,4,45,21],[12,33,11,4,34,12],[3,145,115,1,146,116],[4,64,40,5,65,41],[11,36,16,5,37,17],[11,36,12,5,37,13],[5,109,87,1,110,88],[5,65,41,5,66,42],[5,54,24,7,55,25],[11,36,12],[5,122,98,1,123,99],[7,73,45,3,74,46],[15,43,19,2,44,20],[3,45,15,13,46,16],[1,135,107,5,136,108],[10,74,46,1,75,47],[1,50,22,15,51,23],[2,42,14,17,43,15],[5,150,120,1,151,121],[9,69,43,4,70,44],[17,50,22,1,51,23],[2,42,14,19,43,15],[3,141,113,4,142,114],[3,70,44,11,71,45],[17,47,21,4,48,22],[9,39,13,16,40,14],[3,135,107,5,136,108],[3,67,41,13,68,42],[15,54,24,5,55,25],[15,43,15,10,44,16],[4,144,116,4,145,117],[17,68,42],[17,50,22,6,51,23],[19,46,16,6,47,17],[2,139,111,7,140,112],[17,74,46],[7,54,24,16,55,25],[34,37,13],[4,151,121,5,152,122],[4,75,47,14,76,48],[11,54,24,14,55,25],[16,45,15,14,46,16],[6,147,117,4,148,118],[6,73,45,14,74,46],[11,54,24,16,55,25],[30,46,16,2,47,17],[8,132,106,4,133,107],[8,75,47,13,76,48],[7,54,24,22,55,25],[22,45,15,13,46,16],[10,142,114,2,143,115],[19,74,46,4,75,47],[28,50,22,6,51,23],[33,46,16,4,47,17],[8,152,122,4,153,123],[22,73,45,3,74,46],[8,53,23,26,54,24],[12,45,15,28,46,16],[3,147,117,10,148,118],[3,73,45,23,74,46],[4,54,24,31,55,25],[11,45,15,31,46,16],[7,146,116,7,147,117],[21,73,45,7,74,46],[1,53,23,37,54,24],[19,45,15,26,46,16],[5,145,115,10,146,116],[19,75,47,10,76,48],[15,54,24,25,55,25],[23,45,15,25,46,16],[13,145,115,3,146,116],[2,74,46,29,75,47],[42,54,24,1,55,25],[23,45,15,28,46,16],[17,145,115],[10,74,46,23,75,47],[10,54,24,35,55,25],[19,45,15,35,46,16],[17,145,115,1,146,116],[14,74,46,21,75,47],[29,54,24,19,55,25],[11,45,15,46,46,16],[13,145,115,6,146,116],[14,74,46,23,75,47],[44,54,24,7,55,25],[59,46,16,1,47,17],[12,151,121,7,152,122],[12,75,47,26,76,48],[39,54,24,14,55,25],[22,45,15,41,46,16],[6,151,121,14,152,122],[6,75,47,34,76,48],[46,54,24,10,55,25],[2,45,15,64,46,16],[17,152,122,4,153,123],[29,74,46,14,75,47],[49,54,24,10,55,25],[24,45,15,46,46,16],[4,152,122,18,153,123],[13,74,46,32,75,47],[48,54,24,14,55,25],[42,45,15,32,46,16],[20,147,117,4,148,118],[40,75,47,7,76,48],[43,54,24,22,55,25],[10,45,15,67,46,16],[19,148,118,6,149,119],[18,75,47,31,76,48],[34,54,24,34,55,25],[20,45,15,61,46,16]],p.getRSBlocks=function(a,h){var d=p.getRsBlockTable(a,h);if(void 0==d)throw Error("bad rs block @ typeNumber:"+a+"/errorCorrectLevel:"+h);for(var g=d.length/3,e=[],f=0;g>f;f++)for(var c=d[3*f+0],C=d[3*f+1],v=d[3*f+2],l=0;c>l;l++)e.push(new p(C,v));return e},p.getRsBlockTable=function(a,h){switch(h){case 1:return p.RS_BLOCK_TABLE[4*(a-1)+0];case 0:return p.RS_BLOCK_TABLE[4*(a-1)+1];case 3:return p.RS_BLOCK_TABLE[4*(a-1)+2];case 2:return p.RS_BLOCK_TABLE[4*(a-1)+3]}},t.prototype={get:function(a){return 1==(this.buffer[Math.floor(a/8)]>>>7-a%8&1)},put:function(a,h){for(var d=0;h>d;d++)this.putBit(1==(a>>>h-d-1&1))},getLengthInBits:function(){return this.length},putBit:function(a){var h=Math.floor(this.length/8);this.buffer.length<=h&&this.buffer.push(0),a&&(this.buffer[h]|=128>>>this.length%8),this.length++}},"string"==typeof a&&(a={text:a}),a=r.extend({},{render:"canvas",width:256,height:256,typeNumber:-1,correctLevel:2,background:"#ffffff",foreground:"#000000"},a),this.each(function(){var h;if("canvas"==a.render){h=new o(a.typeNumber,a.correctLevel),h.addData(a.text),h.make();var g=document.createElement("canvas");g.width=a.width,g.height=a.height;for(var d=g.getContext("2d"),c=a.width/h.getModuleCount(),e=a.height/h.getModuleCount(),f=0;f<h.getModuleCount();f++)for(var i=0;i<h.getModuleCount();i++){d.fillStyle=h.isDark(f,i)?a.foreground:a.background;var C=Math.ceil((i+1)*c)-Math.floor(i*c),v=Math.ceil((f+1)*c)-Math.floor(f*c);d.fillRect(Math.round(i*c),Math.round(f*e),C,v)}}else for(h=new o(a.typeNumber,a.correctLevel),h.addData(a.text),h.make(),g=r("<table></table>").css("width",a.width+"px").css("height",a.height+"px").css("border","0px").css("border-collapse","collapse").css("background-color",a.background),d=a.width/h.getModuleCount(),c=a.height/h.getModuleCount(),e=0;e<h.getModuleCount();e++)for(f=r("<tr></tr>").css("height",c+"px").appendTo(g),i=0;i<h.getModuleCount();i++)r("<td></td>").css("width",d+"px").css("background-color",h.isDark(e,i)?a.foreground:a.background).appendTo(f);h=g,jQuery(h).appendTo(this)})}}(jQuery)});
/*!common/widgets/chat-pop/main.js*/
;define("common/widgets/chat-pop/main",["require","exports","module","dep/jquery-qrcode/jquery.qrcode.min","dep/artTemplate/dist/template"],function(require){function a(e){clearTimeout(v);var a=$(this);if($(".chat_me").removeClass("active"),!a.find(".chat_pop_up").length){var c={headImg:a.siblings(".hr_portrait").val().replace(/(https?\:)\/\/www\.(?:lgstatic|lagou)\.com\//gi,""),hrName:a.siblings(".hr_name").val(),hrPosition:a.siblings(".hr_position").val(),hrId:a.siblings(".target_hr").val(),pId:a.siblings(".target_position").val(),isBriefStyle:1==a.attr("data-is-brief-style"),index:a.attr("data-index")};a.append(h.compile(_)({chatData:c,lgsctx:GLOBAL_DOMAIN.lgsctx}));var g=a.find(".hr_headpic");if(g[0]&&"DIV"===g[0].tagName){var b=("default"+Math.floor(4*Math.random()),Math.floor(4*Math.random()));b=b>3?3:b,g.addClass("default"+b),a.find(".default").text(c.hrName.substr(0,1))}var I=GLOBAL_DOMAIN.ctx+"/scanCode/positionChat.html?positionId="+c.pId+"&publishUserId="+c.hrId;a.find(".chat_qrcode").qrcode({width:116,height:116,text:I}),c.index%3===2&&a.addClass("shows_on_left")}a.addClass("active"),a.trigger("click"),e.stopPropagation()}function c(){var a=this;v=setTimeout(function(){$(a).removeClass("active")},100)}require("dep/jquery-qrcode/jquery.qrcode.min");var h=require("dep/artTemplate/dist/template");h.helper("subStr",function(a,c,h){return a.substr(0,c)+(h||"")});var v,_='{{if chatData.isBriefStyle}}\n	<div class="chat_pop_up chat_pop_brief">\n		<span class="arrow"></span>\n		<dl class="chat_main clearfix">\n			<dt><div class="chat_qrcode"></div></dt>\n			<dd class="tips_text">对我发布的职位感兴趣？用拉勾APP扫码，直接和我聊聊吧！</dd>\n		</dl>\n	</div>\n{{else}}\n	<div class="chat_pop_up">\n		<span class="arrow"></span>\n		<dl class="chat_main clearfix">\n			<dt><div class="chat_qrcode"></div></dt>\n			<dd>\n				<dl class="chat_head clearfix">\n					<dt>\n						{{if chatData.headImg}}\n							<img class="hr_headpic" src="{{lgsctx}}/{{chatData.headImg}}" alt="hr头像" width="62" height="62">\n						{{else}}\n							<div class="hr_headpic">{{chatData.hrName | subStr:1}}</div>\n						{{/if}}\n					</dt>\n					<dd>\n						<div class="hr_name">{{chatData.hrName}}</div>\n						<div class="hr_position">{{chatData.hrPosition}}</div>\n					</dd>\n					<dd class="tips_text">Hi，对我发布的职位感兴趣？用拉勾APP扫码，直接和我聊聊吧！</dd>\n				</dl>\n			</dd>\n		</dl>\n	</div>\n{{/if}}\n';$(document).on("mouseenter",".chat_me",a),$(document).on("mouseleave",".chat_me",c)});
/*!search-result/page/index/main.js*/
;define("search-result/page/index/main",["require","exports","module","dep/jquery.cookie/jquery.cookie","common/components/jquery-ui-custom/jquery-ui.custom","search-result/modules/search-bar/main","search-result/modules/switch-city/main","search-result/modules/positions/main","search-result/modules/company/main","search-result/modules/filter/main","search-result/modules/order/main","search-result/modules/list-tips/main","search-result/modules/history/main","search-result/modules/recommendCompanyCity/main","common/widgets/chat-pop/main"],function(require){require("dep/jquery.cookie/jquery.cookie"),require("common/components/jquery-ui-custom/jquery-ui.custom"),require("search-result/modules/search-bar/main"),require("search-result/modules/switch-city/main"),require("search-result/modules/positions/main"),require("search-result/modules/company/main"),require("search-result/modules/filter/main"),require("search-result/modules/order/main"),require("search-result/modules/list-tips/main"),require("search-result/modules/history/main"),require("search-result/modules/recommendCompanyCity/main"),require("common/widgets/chat-pop/main")});