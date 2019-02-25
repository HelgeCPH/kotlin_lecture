module Repeater
    def repeated(times)
        self * times
    end
end

String.send(:include, Repeater)
x = "Hej!"
puts x.repeated(5)