let SessionLoad = 1
let s:so_save = &so | let s:siso_save = &siso | set so=0 siso=0
let v:this_session=expand("<sfile>:p")
silent only
cd ~/d/code/java/competitive\ programming
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
set shortmess=aoO
badd +1 Solution.java
badd +1 template.java
badd +1 later.java
badd +1 input.txt
badd +1 output.txt
badd +1 term
badd +1 resources/modInv.java
badd +1 resources/ncr.java
badd +1 resources/fenwickTree.java
badd +1 resources/segmentTree.java
badd +17 resources/primeSeive.java
badd +1 resources/adjacencyList.java
badd +0 term://.//14217:/usr/bin/zsh
argglobal
%argdel
$argadd Solution.java
edit Solution.java
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
wincmd _ | wincmd |
split
1wincmd k
wincmd w
set nosplitbelow
set nosplitright
wincmd t
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 115 + 75) / 151)
exe '2resize ' . ((&lines * 15 + 17) / 35)
exe 'vert 2resize ' . ((&columns * 35 + 75) / 151)
exe '3resize ' . ((&lines * 16 + 17) / 35)
exe 'vert 3resize ' . ((&columns * 35 + 75) / 151)
argglobal
let s:l = 122 - ((20 * winheight(0) + 16) / 32)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
122
normal! 0
wincmd w
argglobal
if bufexists("input.txt") | buffer input.txt | else | edit input.txt | endif
let s:l = 1 - ((0 * winheight(0) + 7) / 15)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
wincmd w
argglobal
if bufexists("term://.//14217:/usr/bin/zsh") | buffer term://.//14217:/usr/bin/zsh | else | edit term://.//14217:/usr/bin/zsh | endif
let s:l = 1 - ((0 * winheight(0) + 8) / 16)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
wincmd w
exe 'vert 1resize ' . ((&columns * 115 + 75) / 151)
exe '2resize ' . ((&lines * 15 + 17) / 35)
exe 'vert 2resize ' . ((&columns * 35 + 75) / 151)
exe '3resize ' . ((&lines * 16 + 17) / 35)
exe 'vert 3resize ' . ((&columns * 35 + 75) / 151)
tabedit template.java
set splitbelow splitright
set nosplitbelow
set nosplitright
wincmd t
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
argglobal
let s:l = 1 - ((0 * winheight(0) + 16) / 32)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
tabedit later.java
set splitbelow splitright
set nosplitbelow
set nosplitright
wincmd t
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
argglobal
let s:l = 1 - ((0 * winheight(0) + 16) / 32)
if s:l < 1 | let s:l = 1 | endif
exe s:l
normal! zt
1
normal! 0
tabnext 1
if exists('s:wipebuf') && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20 winminheight=1 winminwidth=1 shortmess=filnxtToOS
let s:sx = expand("<sfile>:p:r")."x.vim"
if file_readable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &so = s:so_save | let &siso = s:siso_save
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
